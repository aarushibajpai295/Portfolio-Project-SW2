/**
 * Layered implementation of BookSecondary.
 */
public abstract class BookSecondary implements BookComponent {
    /**
     * Returns a boolean value based on if this is the same book as
     * {@code BookComponent} b.
     *
     * @param book
     *            The book which is compared to this to check if they are the
     *            same.
     * @return true iff {@code book} is the same as this.
     *
     * @requires book.isbnCode != null && this.isbnCode != null
     */
    public final boolean sameBook(BookComponent book) {
        boolean sameBookAs = false;
        sameBookAs = this.isbnCode().equals(book.isbnCode());
        return sameBookAs;
    }

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
    public final boolean sameAuthor(BookComponent book) {
        boolean sameAuthorAs = this.author().equals(book.author());
        return sameAuthorAs;
    }

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
    public final boolean sameGenre(BookComponent book) {
        boolean sameGenreAs = this.genre().equals(book.genre());
        return sameGenreAs;
    }

    /**
     * Marks this as read by changing its status.
     *
     * @param date
     *            The date the book was finished on
     * @updates this.status && this.dateRead
     * @requires date != null
     * @ensures this.status == READ && this.dateRead = date
     */
    public final void markRead(int date) {
        this.setStatus(Status.READ);
        this.setDateRead(date);
    }

    /**
     * Marks this as want to read by changing its status.
     *
     * @updates this.status
     * @ensures this.status = WANT_TO_READ
     */
    public final void markWantToRead() {
        this.setStatus(Status.WANT_TO_READ);
    }

    /**
     * Returns a boolean value depending on if this has been read or not.
     *
     * @return true iff this has status READ.
     */
    public final boolean isRead() {
        boolean readOrNot = false;
        if (this.status() == Status.READ) {
            readOrNot = true;
        }
        return readOrNot;
    }

    /**
     * Object methods.
     */

    @Override
    public boolean equals(Object obj) {
        boolean equalOrNot = false;
        if (obj == this) {
            equalOrNot = true;
        }
        if (obj == null) {
            equalOrNot = false;
        }
        return equalOrNot;
    }
}
