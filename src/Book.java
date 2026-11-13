
/**
 * {@code BookComponentKernel} enhanced with secondary emthods.
 */
public interface Book extends BookKernel {
    /**
     * Returns a boolean value based on if this is the same book as
     * {@code BookComponent} b.
     *
     * @param book
     *            The book which is compared to this to check if they are the
     *            same.
     * @return true iff {@code book} is the same as this.
     *
     * @requires book.title != null && this.title != null
     */
    boolean sameBook(Book book);

    /**
     * Returns a boolean value if this and {@code BookComponent} book have the
     * same author.
     *
     * @param book
     *            The book which is compared to this to check if they have the
     *            same author
     *
     * @return true iff {@code book} has the same author as this
     *
     * @requires book.author != null && this.author != null
     */
    boolean sameAuthor(Book book);

    /**
     * Returns a boolean value if this and {@code BookComponent} book have the
     * same genre.
     *
     * @param book
     *            The book which is compared to this to check if they have the
     *            same genre
     *
     * @return true iff {@code book} has the same genre as this
     *
     * @requires book.genre != null && this.genre != null
     */
    boolean sameGenre(Book book);

    /**
     * Marks this as read by changing its status.
     *
     * @param date
     *            The date the book was finished on
     * @updates this.status && this.dateRead
     * @requires date != null
     * @ensures this.status == READ && this.dateRead = date
     */
    void markRead(int date);

    /**
     * Marks this as want to read by changing its status.
     *
     * @updates this.status
     * @ensures this.status = WANT_TO_READ
     */
    void markWantToRead();

    /**
     * Returns a boolean value depending on if this has been read or not.
     *
     * @return true iff this has status READ.
     */
    boolean isRead();
}
