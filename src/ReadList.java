import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Use Case 1: This case creates a list of all the books the user has read and
 * wants to read. The user will first enter all the books they want included in
 * the list and classify its author, genre, whether they have read it or want to
 * read it and if they have read it the date they finished. The program will
 * then output a list of their read books and a list of their want to read books
 * in an output file.
 */
public final class ReadList {
    /**
     * Private no-argument constructor to prevent instantiation of this utility
     * class.
     */
    private ReadList() {
    }

    /**
     * This method creates the html file in which the output will be represented
     * as a table. It also calls the addBooks method which adds the books as
     * rows in the table.
     *
     * @param in
     *            the input stream
     * @param outTerminal
     *            the output stream
     * @param out
     *            the outputFile stream
     */
    public static void readBooks(SimpleReader in, SimpleWriter out,
            SimpleWriter outTerminal) {

        //Opening tags
        out.println("<!DOCTYPE html>");
        out.println("<html lang = \"en\">");
        out.println("<head>");
        out.println("<title> Reading List </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<hr>");
        out.println("<h1> My Read and Want to Read List </h1>");
        out.println("<table border=\"1\">");
        out.println("<tr>");
        out.println("<thead>");
        out.println("<th>Book Title</th>");
        out.println("<th>Author</th>");
        out.println("<th>Genre</th>");
        out.println("<th>Status Title</th>");
        out.println("<th>Date Read</th>");
        out.println("</thead>");
        out.println("<tbody>");

        //Add books from user and then print as table row.
        addBooks(in, outTerminal, out);

        //Closing tags
        out.println("</tbody>");
        out.println("</tr>");
        out.println("</body>");
        out.println("</html>");
    }

    /**
     * This method continously adds books until user is done. It gets
     * information about a book and then creates a book component which holds
     * all this information adn is used to add it back as rows in the table.
     *
     * @param in
     *            the input stream
     * @param outTerminal
     *            the output stream
     * @param out
     *            the outputFile stream
     */
    public static void addBooks(SimpleReader in, SimpleWriter outTerminal,
            SimpleWriter out) {
        String cont = "";

        while (!cont.equals("no")) {
            outTerminal.println("Enter the name of the book: ");
            String nameBook = in.nextLine();
            outTerminal.println("Enter the author of the book: ");
            String authorBook = in.nextLine();
            outTerminal.println("Enter the genre of the book: ");
            String genreBook = in.nextLine();
            outTerminal.println(
                    "Have you read this book? (Enter 'no' for want to read): ");
            String readOrNot = in.nextLine();

            Book.Status status;
            int dateRead = 0;

            if (readOrNot.equals("no")) {
                status = Book.Status.WANT_TO_READ;
            } else {
                status = Book.Status.READ;
                outTerminal.println(
                        "When did you read this book? Enter YYYYMMDD format ");
                dateRead = in.nextInteger();
            }

            Book newBook = new Book1L(nameBook, authorBook, genreBook, dateRead,
                    status);
            String formattedDate = formatDate(dateRead);

            out.println("<tr>");
            out.println("<td> " + newBook.title() + " </td>");
            out.println("<td> " + newBook.author() + " </td>");
            out.println("<td> " + newBook.genre() + " </td>");
            if (newBook.status() == Book.Status.READ) {
                out.println("<td> Read </td>");
            } else {
                out.println("<td> Want to Read </td>");
            }
            if (dateRead == 0) {
                out.println("Not read yet.");
            } else {
                out.println("<td> " + formattedDate + " </td>");
            }
            out.println("</tr>");

            outTerminal.println(
                    "Would you like to add more books? (Hit enter if no.)");
            cont = in.nextLine();
        }
    }

    /**
     * This takes in input the date as int d and then formats it in DD.MM.YYYY
     * format and presents it as a string.
     *
     * @param d
     *            The date input as an int
     * @return result The formatted date as a string
     */
    public static String formatDate(int d) {
        String result = "";
        if (d != 0) {
            final int yearDiv = 1000;
            final int monthDayDiv = 100;

            int year = d / yearDiv;
            int monthOne = d / monthDayDiv;
            int monthTwo = monthOne % monthDayDiv;
            int day = d / monthDayDiv;

            result = day + "." + monthTwo + "." + year;
        }
        return result;
    }

    /**
     * Main Method.
     *
     * @param args
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        SimpleWriter outFile = new SimpleWriter1L("outputFile.html");
        readBooks(in, outFile, out);

        outFile.close();
        in.close();
        out.close();
    }
}
