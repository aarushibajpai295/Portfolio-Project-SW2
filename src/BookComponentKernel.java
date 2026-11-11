
//import components.BookComponent;
import components.standard.Standard;

/**
 * Book kernel component with primary methods.
 */
public interface BookComponentKernel extends Standard<BookComponent> {

    /**
     *
     * Status.
     */
    enum Status {
        /**
         * Different reading statuses of the books.
         */
        WANT_TO_READ, READ, READING
    }

    /**
     * Reports the title of {@code this} and returns it as a String.
     *
     * @return the title of the book
     * @requires this.title != null
     * @ensures title = this.title
     */
    String title();

    /**
     * Reports the author of {@code book} and returns it as a String.
     *
     * @return the author of the this
     * @requires book.author != null
     */
    String author();

    /**
     * Reports the genre of {@code book} and returns it as a String.
     *
     * @return the genre of this
     * @requires book.genre != null
     */
    String genre();

    /**
     * Reports the ISBN Code of {@code book} and returns it as a String.
     *
     * @return the ISBN code of this
     * @requires book.isbnCode != null
     */
    String isbnCode();

    /**
     * Reports the ISBN Code of {@code book} and returns it as a String.
     *
     * @return the status of this
     * @requires status = this.status
     */
    Status setStatus();

    /**
     * Reports the ISBN Code of {@code book} and returns it as a String.
     *
     * @return the read date of this
     * @requires dateRead = this.dateRead
     */
    int dateRead();

    /**
     * Changes the status of this to {@code s}.
     *
     * @param s
     *            The status which replaces the current status of the book
     * @updates this.status
     * @requires s != null
     * @ensures this.status = s
     */
    void setStatus(Status s);

    /**
     * Sets the date read of this to {@code date}.
     *
     * @param date
     *            the date which is the book is finished on in YYYYMMDD format.
     * @updates this.dateRead
     * @requires date != null
     * @ensures this.dateRead = date
     */
    void setDateRead(int date);
}
