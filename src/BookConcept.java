import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * This is proof of concept assignment for the book component. bookConcept
 */
public class BookConcept {
    /*
     * Private members
     */

    /**
     * Representation of {@code} this.title.
     */
    @SuppressWarnings("unused")
    private String title;
    /**
     * Representation of {@code} this.author.
     */
    @SuppressWarnings("unused")
    private String author;
    /**
     * Representation of {@code} this.genre.
     */
    @SuppressWarnings("unused")
    private String genre;
    /**
     * Representation of {@code} this.isbnCode.
     */
    @SuppressWarnings("unused")
    private String isbnCode;

    /**
     * Creator of new representation.
     */
    public void createNewRep() {
        this.title = "";
        this.author = "";
        this.genre = "";
        this.isbnCode = "";
    }

    /**
     * No-argument constructor.
     */
    public BookConcept() {
        this.createNewRep();
    }

    /**
     * Constructor with all {@code strings}.
     *
     * @param title
     *            the {@code title} to initialize from
     * @param author
     *            the {@code author} to initialize from
     * @param genre
     *            the {@code genre} to initialize from
     * @param isbnCode
     *            the {@code isbnCode} to initialize from
     */
    public BookConcept(String title, String author, String genre,
            String isbnCode) {

        this.createNewRep();

        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbnCode = isbnCode;
    }

    /**
     * Kernel Methods.
     */

    /**
     * This method returns the title of a book.
     *
     * @return titleOfBook this is the title of the book as a string
     */
    public final String title() {
        String titleOfBook = this.title();
        return titleOfBook;
    }

    /**
     * This method returns the author of a book.
     *
     * @return authorOfBook this is the author of the book as a string
     */
    public final String author() {
        String authorOfBook = this.author();
        return authorOfBook;
    }

    /**
     * This method returns the genre of a book.
     *
     * @return genreOfBook this is the genre of the book as a string
     */
    public final String genre() {
        String genreOfBook = this.genre();
        return genreOfBook;
    }

    /**
     * This method returns the ISBN code of a book.
     *
     * @return isbnOfBook this is the ISBN code of the book as a string
     */
    public final String isbnCode() {
        String isbnOfBook = this.isbnCode();
        return isbnOfBook;
    }

    /**
     * Secondary Methods
     */

    /**
     * This method checks if this is the same book as b.
     *
     * @param b
     *            The BookConcept b which this is being compared to
     * @return sameBook Returns the boolean variable sameBook and tells if it is
     *         the same book or not
     */
    public boolean sameBookAs(BookConcept b) {
        boolean sameBook = this.isbnCode().equals(b.isbnCode());
        return sameBook;
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();

        BookConcept firstBook = new BookConcept("Red Rising", "Pierce Brown",
                "Science-FIction", "100-00000");

        BookConcept secondBook = new BookConcept("Golden Son", "Pierce Brown",
                "Science-FIction", "100-00001");

        BookConcept thirdBook = new BookConcept("Dark Matter", "Blake Crouch",
                "Science-FIction", "110-00001");

        BookConcept firstBookCopy = new BookConcept("Red Rising",
                "Pierce Brown", "Science-FIction", "100-00000");

        out.println("Title: " + firstBook.title());
        out.println("Author: " + firstBook.author());
        out.println("Genre: " + firstBook.genre());

        out.println("Title: " + secondBook.title());
        out.println("Author: " + secondBook.author());
        out.println("Genre: " + secondBook.genre());

        //check if first book is the same as third book (should return false)
        boolean sameFirstAndThird = firstBook.sameBookAs(thirdBook);
        out.println(sameFirstAndThird);

        //check if first book is the same as first book copy (should return true)
        boolean sameFirstAndCopy = firstBook.sameBookAs(firstBookCopy);
        out.println(sameFirstAndCopy);

        out.close();
    }
}
