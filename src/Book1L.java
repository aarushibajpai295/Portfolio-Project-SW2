/**
 * {@code BookComponent} represented as a {@code String} with implementations of
 * primary methods.
 *
 * @convention <pre>
 * [title, author, genre, isbnCode, and status can not be null]  and
 * [If this.status != READ then this.dateRead = 0] and
 * [If this.status = READ, then this.dateRead = 0 or date in YYYYMMDD format,
 * where MM is between 1-12 and DD is between 1-31]
 * </pre>
 * @correspondence <pre>
 * this = [this.title, this.author, this.genre, this.isbnCode, this.status, this.dateRead]
 * </pre>
 *
 * @author Aarushi Bajpai
 *
 */
public class Book1L extends BookSecondary {
    /*
     * Private members
     */

    /**
     * Representation of {@code} this.title.
     */
    private String title;
    /**
     * Representation of {@code} this.author.
     */
    private String author;
    /**
     * Representation of {@code} this.genre.
     */
    private String genre;
    /**
     * Representation of {@code} this.isbnCode.
     */
    private String isbnCode;
    /**
     * Representation of {@code} this.genre.
     */
    private int dateRead;
    /**
     * Representation of {@code} this.isbnCode.
     */
    private Status status;

    /**
     * Creator of new representation.
     */
    public void createNewRep() {
        this.title = "";
        this.author = "";
        this.genre = "";
        this.isbnCode = "";
        this.dateRead = 0;
        this.status = Status.NOT_IN_LIST;
    }

    /**
     * No-argument constructor.
     */
    public Book1L() {
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
     * @param dateRead
     *            the {@code dateRead} to initialize from
     * @param status
     *            the {@code status} to initialize from
     */
    public Book1L(String title, String author, String genre, String isbnCode,
            int dateRead, Status status) {

        this.createNewRep();

        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbnCode = isbnCode;
        this.dateRead = dateRead;
        this.status = status;
    }

    /*
     * Standard Methods.
     */
    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final void transferFrom(BookComponent source) {
        Book1L localSource = (Book1L) source;

        this.title = localSource.title;
        this.author = localSource.author;
        this.genre = localSource.genre;
        this.isbnCode = localSource.isbnCode;
    }

    @Override
    public final BookComponent newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    /**
     * Kernel Methods.
     */

    /**
     * This method returns the title of a book.
     *
     * @return titleOfBook this is the title of the book as a string
     */
    @Override
    public final String title() {
        String titleOfBook = this.title;
        return titleOfBook;
    }

    /**
     * This method returns the author of a book.
     *
     * @return authorOfBook this is the author of the book as a string
     */
    @Override
    public final String author() {
        String authorOfBook = this.author;
        return authorOfBook;
    }

    /**
     * This method returns the genre of a book.
     *
     * @return genreOfBook this is the genre of the book as a string
     */
    @Override
    public final String genre() {
        String genreOfBook = this.genre;
        return genreOfBook;
    }

    /**
     * This method returns the ISBN code of a book.
     *
     * @return isbnOfBook this is the ISBN code of the book as a string
     */
    @Override
    public final String isbnCode() {
        String isbnOfBook = this.isbnCode;
        return isbnOfBook;
    }

    /**
     * Reports the status of this, whether it is read, want to read, or
     * currently reading ans returns it.
     *
     * @return the status of this
     * @requires status = this.status
     */
    @Override
    public final Status status() {
        Status statusOfBook = this.status;
        return statusOfBook;
    }

    /**
     * Reports the date read of this and returns it as an int.
     *
     * @return the read date of this
     * @requires dateRead = this.dateRead
     */
    @Override
    public final int dateRead() {
        int readDate = this.dateRead;
        return readDate;
    }

    /**
     * Changes the status of this to {@code s}.
     *
     * @param s
     *            The status which replaces the current status of the book
     * @updates this.status
     * @requires s != null
     * @ensures this.status = s
     */
    @Override
    public final void setStatus(Status s) {
        this.status = s;
        if (s != Status.READ) {
            this.dateRead = 0;
        }
    }

    /**
     * Sets the date read of this to {@code date}.
     *
     * @param date
     *            the date which is the book is finished on in YYYYMMDD format.
     * @updates this.dateRead
     * @requires date != null
     * @ensures this.dateRead = date
     */
    @Override
    public final void setDateRead(int date) {
        this.dateRead = date;
    }
}
