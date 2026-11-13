import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Use Case 2: This case first creates a few BookComponent objects and then uses
 * them to print out how many books have been read, are currently being read,
 * and how many are want to read. It also prints the name of those respective
 * books under each status.
 */
public final class ReadingTracker {
        /**
         * Private no-argument constructor to prevent instantiation of this
         * utility class.
         */
        private ReadingTracker() {
        }

        /**
         * Main Method.
         *
         * @param args
         */
        public static void main(String[] args) {
                SimpleReader in = new SimpleReader1L();
                SimpleWriter out = new SimpleWriter1L();

                final int date1 = 20260905;
                final int date2 = 20260531;
                final int date3 = 20360327;

                Book a = new Book1L("Morning Star", "Pierce Brown",
                                "Science-Fiction", date1, Book.Status.READ);
                Book b = new Book1L("Words Of Radiance", "Brandon Sanderson",
                                "Fantasy", date2, Book.Status.READ);
                Book c = new Book1L("Babel", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.WANT_TO_READ);
                Book d = new Book1L("Yesteryear", "Caro Claire Burke",
                                "Fiction", 0, Book.Status.WANT_TO_READ);
                Book e = new Book1L("Project Hail Mary", "Andy Weir",
                                "Science-Fiction", date3, Book.Status.READ);
                Book f = new Book1L("Your Name in The Sand", "Ann Liang",
                                "Romance", 0, Book.Status.WANT_TO_READ);
                Book g = new Book1L("Knave and the Moon", "Rachel Gilig",
                                "Fantasy", 0, Book.Status.READING);

                Book[] books = { a, b, c, d, e, f, g };

                int read = 0;
                int wantToRead = 0;
                int reading = 0;
                String readBooks = "";
                String readingBook = "";
                String wantToReadBook = "";

                for (int i = 0; i < books.length; i++) {
                        if (books[i].status() == Book.Status.READ) {
                                read++;
                                readBooks += books[i].title() + ", ";
                        } else if (books[i].status() == Book.Status.READING) {
                                reading++;
                                readingBook += books[i].title() + ", ";
                        } else {
                                wantToRead++;
                                wantToReadBook += books[i].title() + ", ";
                        }
                }

                out.println("Books Read: " + read);
                out.println("Titles of Books Read: " + readBooks);
                out.println("Books Reading: " + reading);
                out.println("Titles of Books Read: " + readingBook);
                out.println("Books Want To Read: " + wantToRead);
                out.println("Titles of Books Read: " + wantToReadBook);

                in.close();
                out.close();
        }
}
