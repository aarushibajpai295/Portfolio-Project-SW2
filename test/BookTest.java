import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * JUnit test fixture for {@code Book1L}'s constructors, kernel, and secondary
 * methods.
 *
 * @author Aarushi Bajpai
 *
 */
public class BookTest {

        /**
         * Test for constructor.
         */
        @Test
        public void testConstructor() {
                Book bookCon = new Book1L();
                assertEquals(new Book1L(), bookCon);
        }

        /**
         * Test for kernel methods
         */

        /**
         * Test for title() kernel method
         */

        /**
         * Test for one word title, when book is want to read.
         */
        @Test
        public void testTitleOne1() {
                Book book = new Book1L("Babel", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.WANT_TO_READ);

                String titleBook = book.title();

                assertEquals("Babel", titleBook);
                //assertEquals(bookExpected, book);
        }

        /**
         * Test for one word title, when book is read.
         */
        @Test
        public void testTitleOne2() {
                final int date = 20260531;
                Book book = new Book1L("Katabasis", "R.F. Kuang", "Fantasy",
                                date, Book.Status.READ);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", date, Book.Status.READ);

                String titleBook = book.title();

                assertEquals("Katabasis", titleBook);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for two word title, when book is want to read.
         */
        @Test
        public void testTitleTwo1() {
                Book book = new Book1L("Morning Star", "Pierce Brown",
                                "Science-Fiction", 0, Book.Status.WANT_TO_READ);
                Book bookExpected = new Book1L("Morning Star", "Pierce Brown",
                                "Science-Fiction", 0, Book.Status.WANT_TO_READ);

                String titleBook = book.title();

                assertEquals("Morning Star", titleBook);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for two word title, when book is read.
         */
        @Test
        public void testTitleTwo2() {
                final int date = 20260907;
                Book book = new Book1L("Morning Star", "Pierce Brown",
                                "Science-Fiction", date, Book.Status.READ);
                Book bookExpected = new Book1L("Morning Star", "Pierce Brown",
                                "Science-Fiction", date, Book.Status.READ);

                String titleBook = book.title();

                assertEquals("Morning Star", titleBook);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for multiple word title, when book is read.
         */
        @Test
        public void testTitleMult1() {
                final int date = 20260531;
                Book book = new Book1L("Words Of Radiance", "Brandon Sanderson",
                                "Fantasy", date, Book.Status.READ);
                Book bookExpected = new Book1L("Words Of Radiance",
                                "Brandon Sanderson", "Fantasy", date,
                                Book.Status.READ);

                String titleBook = book.title();

                assertEquals("Words Of Radiance", titleBook);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for multiple word title, when book is want to read.
         */
        @Test
        public void testTitleMult2() {
                final int date = 20260905;
                Book book = new Book1L("Your Name in The Sand", "Ann Liang",
                                "Romance", date, Book.Status.WANT_TO_READ);
                Book bookExpected = new Book1L("Your Name in The Sand",
                                "Ann Liang", "Romance", date,
                                Book.Status.WANT_TO_READ);

                String titleBook = book.title();

                assertEquals("Your Name in The Sand", titleBook);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for author() kernel method
         */

        /**
         * Test for two word author name.
         */
        @Test
        public void testAuthor1() {
                Book book = new Book1L("Morning Star", "Pierce Brown",
                                "Science-Fiction", 0, Book.Status.WANT_TO_READ);
                Book bookExpected = new Book1L("Morning Star", "Pierce Brown",
                                "Science-Fiction", 0, Book.Status.WANT_TO_READ);

                String authorBook = book.author();

                assertEquals("Pierce Brown", authorBook);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for author name with punctuation.
         */
        @Test
        public void testAuthor2() {
                final int date = 20260531;
                Book book = new Book1L("Katabasis", "R.F. Kuang", "Fantasy",
                                date, Book.Status.READ);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", date, Book.Status.READ);

                String authorBook = book.author();

                assertEquals("R.F. Kuang", authorBook);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for longer author name.
         */
        @Test
        public void testAuthor3() {
                Book book = new Book1L("All In", "Jennifer Lynn Barnes",
                                "Mystery", 0, Book.Status.WANT_TO_READ);
                Book bookExpected = new Book1L("All In", "Jennifer Lynn Barnes",
                                "Mystery", 0, Book.Status.WANT_TO_READ);

                String authorBook = book.author();

                assertEquals("Jennifer Lynn Barnes", authorBook);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for genre() kernel method
         */

        /**
         * Test for two word genre name, with punctuation.
         */
        @Test
        public void testGenre1() {
                Book book = new Book1L("Morning Star", "Pierce Brown",
                                "Science-Fiction", 0, Book.Status.WANT_TO_READ);
                Book bookExpected = new Book1L("Morning Star", "Pierce Brown",
                                "Science-Fiction", 0, Book.Status.WANT_TO_READ);

                String genreBook = book.genre();

                assertEquals("Science-Fiction", genreBook);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for one word genre name.
         */
        @Test
        public void testGenre2() {
                final int date = 20260531;
                Book book = new Book1L("Katabasis", "R.F. Kuang", "Fantasy",
                                date, Book.Status.READ);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", date, Book.Status.READ);

                String genreBook = book.genre();

                assertEquals("Fantasy", genreBook);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for two word genre name, no punctuation.
         */
        @Test
        public void testGenre3() {
                final int date = 20250328;
                Book book = new Book1L("Between the Shades of Gray",
                                "Ruta Sepetys", "Historical Fiction", date,
                                Book.Status.READ);
                Book bookExpected = new Book1L("Between the Shades of Gray",
                                "Ruta Sepetys", "Historical Fiction", date,
                                Book.Status.READ);

                String genreBook = book.genre();

                assertEquals("Historical Fiction", genreBook);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for status() kernel method
         */

        /**
         * Test for status, when it is reading.
         */
        @Test
        public void testStatus1() {
                Book book = new Book1L("Morning Star", "Pierce Brown",
                                "Science-Fiction", 0, Book.Status.READING);

                Book.Status bookStatus = book.status();

                assertEquals(Book.Status.READING, bookStatus);
        }

        /**
         * Test for status when it is read.
         */
        @Test
        public void testStatus2() {
                final int date = 20260531;
                Book book = new Book1L("Katabasis", "R.F. Kuang", "Fantasy",
                                date, Book.Status.READ);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", date, Book.Status.READ);

                Book.Status bookStatus = book.status();

                assertEquals(Book.Status.READ, bookStatus);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for status when it is want to read.
         */
        @Test
        public void testStatus3() {
                Book book = new Book1L("All In", "Jennifer Lynn Barnes",
                                "Mystery", 0, Book.Status.WANT_TO_READ);
                Book bookExpected = new Book1L("All In", "Jennifer Lynn Barnes",
                                "Mystery", 0, Book.Status.WANT_TO_READ);

                Book.Status bookStatus = book.status();

                assertEquals(Book.Status.WANT_TO_READ, bookStatus);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for status when it is not in list.
         */
        @Test
        public void testStatus4() {
                Book book = new Book1L("Glorious Rivals",
                                "Jennifer Lynn Barnes", "Mystery", 0,
                                Book.Status.NOT_IN_LIST);
                Book bookExpected = new Book1L("Glorious Rivals",
                                "Jennifer Lynn Barnes", "Mystery", 0,
                                Book.Status.NOT_IN_LIST);

                Book.Status bookStatus = book.status();

                assertEquals(Book.Status.NOT_IN_LIST, bookStatus);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for dateRead() kernel method
         */

        /**
         * Test for date read when it is read, and has a date.
         */
        @Test
        public void testDate1() {
                final int date = 20260531;
                Book book = new Book1L("Katabasis", "R.F. Kuang", "Fantasy",
                                date, Book.Status.READ);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", date, Book.Status.READ);

                int dateActual = book.dateRead();

                assertEquals(date, dateActual);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for date read when it is want to read, and has 0 as the
         * dateRead.
         */
        @Test
        public void testDate2() {
                Book book = new Book1L("All In", "Jennifer Lynn Barnes",
                                "Mystery", 0, Book.Status.WANT_TO_READ);
                Book bookExpected = new Book1L("All In", "Jennifer Lynn Barnes",
                                "Mystery", 0, Book.Status.WANT_TO_READ);

                int dateActual = book.dateRead();

                assertEquals(0, dateActual);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for dateRead when it is not in list, 0 as dateRead.
         */
        @Test
        public void testDate3() {
                Book book = new Book1L("Glorious Rivals",
                                "Jennifer Lynn Barnes", "Mystery", 0,
                                Book.Status.NOT_IN_LIST);
                Book bookExpected = new Book1L("Glorious Rivals",
                                "Jennifer Lynn Barnes", "Mystery", 0,
                                Book.Status.NOT_IN_LIST);

                int dateActual = book.dateRead();

                assertEquals(0, dateActual);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for dateRead when it is currently reading, 0 as dateRead.
         */
        @Test
        public void testDate4() {
                Book book = new Book1L("Glorious Rivals",
                                "Jennifer Lynn Barnes", "Mystery", 0,
                                Book.Status.READING);
                Book bookExpected = new Book1L("Glorious Rivals",
                                "Jennifer Lynn Barnes", "Mystery", 0,
                                Book.Status.READING);

                int dateActual = book.dateRead();

                assertEquals(0, dateActual);
                assertEquals(bookExpected, book);
        }

        /**
         * Test for setStaus() kernel method
         */

        /**
         * Test for setStatus when it is currently not in list, changes to want
         * to read.
         */
        @Test
        public void testsetStatus1() {
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.NOT_IN_LIST);
                Book bookExpected = new Book1L("Poppy War", "R.F. Kuang",
                                "Fantasy", 0, Book.Status.WANT_TO_READ);

                book.setStatus(Book.Status.WANT_TO_READ);

                assertEquals(bookExpected.status(), book.status());
                assertEquals(bookExpected.dateRead(), book.dateRead());
        }

        /**
         * Test for setStatus when it is currently not in list, changes to
         * reading.
         */
        @Test
        public void testsetStatus2() {
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.NOT_IN_LIST);
                Book bookExpected = new Book1L("Poppy War", "R.F. Kuang",
                                "Fantasy", 0, Book.Status.READING);

                book.setStatus(Book.Status.READING);

                assertEquals(bookExpected.status(), book.status());
                assertEquals(bookExpected.dateRead(), book.dateRead());
        }

        /**
         * Test for setStatus when it is currently not in list, changes to read.
         */
        @Test
        public void testsetStatus3() {
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.NOT_IN_LIST);
                Book bookExpected = new Book1L("Poppy War", "R.F. Kuang",
                                "Fantasy", 0, Book.Status.READ);

                book.setStatus(Book.Status.READ);

                assertEquals(bookExpected.status(), book.status());
        }

        /**
         * Test for setStatus when it is currently want to read, changes to not
         * in list.
         */
        @Test
        public void testsetStatus4() {
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.WANT_TO_READ);
                Book bookExpected = new Book1L("Poppy War", "R.F. Kuang",
                                "Fantasy", 0, Book.Status.NOT_IN_LIST);

                book.setStatus(Book.Status.NOT_IN_LIST);

                assertEquals(bookExpected.status(), book.status());
                assertEquals(bookExpected.dateRead(), book.dateRead());
        }

        /**
         * Test for setStatus when it is currently reading, changes to not in
         * list.
         */
        @Test
        public void testsetStatus5() {
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.READING);
                Book bookExpected = new Book1L("Poppy War", "R.F. Kuang",
                                "Fantasy", 0, Book.Status.NOT_IN_LIST);

                book.setStatus(Book.Status.NOT_IN_LIST);

                assertEquals(bookExpected.status(), book.status());
                assertEquals(bookExpected.dateRead(), book.dateRead());
        }

        /**
         * Test for setDateRead() kernel method
         */

        /**
         * Test for setStatus when it is currently reading, changes to not in
         * list.
         */
        @Test
        public void testsetDate1() {
                final int dateRead = 20260814;
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.READ);
                Book bookExpected = new Book1L("Poppy War", "R.F. Kuang",
                                "Fantasy", dateRead, Book.Status.READ);

                book.setDateRead(dateRead);

                assertEquals(bookExpected.dateRead(), book.dateRead());
        }

        /**
         * Test for setStatus when it is currently reading, changes to not in
         * list.
         */
        @Test
        public void testsetDate2() {
                final int dateRead = 20260814;
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.READ);
                Book bookExpected = new Book1L("Poppy War", "R.F. Kuang",
                                "Fantasy", dateRead, Book.Status.READ);

                book.setDateRead(dateRead);

                assertEquals(bookExpected.dateRead(), book.dateRead());
        }

        /**
         * Test for setStatus when it is currently reading, changes to not in
         * list.
         */
        @Test
        public void testsetDate3() {
                final int dateRead = 20260814;
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.READ);
                Book bookExpected = new Book1L("Poppy War", "R.F. Kuang",
                                "Fantasy", dateRead, Book.Status.READ);

                book.setDateRead(dateRead);

                assertEquals(bookExpected.dateRead(), book.dateRead());
        }

        /**
         * Test for setStatus when it is currently reading, changes to not in
         * list.
         */
        @Test
        public void testsetDate4() {
                final int dateRead = 20260814;
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.READ);
                Book bookExpected = new Book1L("Poppy War", "R.F. Kuang",
                                "Fantasy", dateRead, Book.Status.READ);

                book.setDateRead(dateRead);

                assertEquals(bookExpected.dateRead(), book.dateRead());
        }

        /**
         * Test for secondary methods
         */

        /**
         * Test for sameBook() kernel method
         */

        /**
         * Test for sameBook when it is the same book and should return true.
         */
        @Test
        public void testsameBook1() {
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.READING);
                Book bookExpected = new Book1L("Poppy War", "R.F. Kuang",
                                "Fantasy", 0, Book.Status.READING);

                boolean same = book.sameBook(bookExpected);

                assertEquals(true, same);
        }

        /**
         * Test for sameBook when it is not the same book and should return
         * false.
         */
        @Test
        public void testsameBook2() {
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.READING);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", 0, Book.Status.READING);

                boolean same = book.sameBook(bookExpected);

                assertEquals(false, same);
        }

        /**
         * Test for sameBook when it is the same book and should return true.
         * The book has been read.
         */
        @Test
        public void testsameBook3() {
                final int dateRead = 20260814;
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy",
                                dateRead, Book.Status.READ);
                Book bookExpected = new Book1L("Poppy War", "R.F. Kuang",
                                "Fantasy", dateRead, Book.Status.READ);

                boolean same = book.sameBook(bookExpected);

                assertEquals(true, same);
        }

        /**
         * Test for sameBook when it is not the same book and should return
         * false. The book has been read.
         */
        @Test
        public void testsameBook4() {
                final int dateRead = 20260814;
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy",
                                dateRead, Book.Status.READ);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", dateRead, Book.Status.READ);

                boolean same = book.sameBook(bookExpected);

                assertEquals(false, same);
        }

        /**
         * Test for sameAuthor() kernel method
         */

        /**
         * Test for sameAuthor when it is the same author and should return
         * true.
         */
        @Test
        public void testsameAuthor1() {
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.READING);
                Book bookExpected = new Book1L("Poppy War", "R.F. Kuang",
                                "Fantasy", 0, Book.Status.READING);

                boolean same = book.sameAuthor(bookExpected);

                assertEquals(true, same);
        }

        /**
         * Test for sameAuthor when it is not the same author and should return
         * false.
         */
        @Test
        public void testsameAuthor2() {
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.READING);
                Book bookExpected = new Book1L("Morning Star", "Pierce Brown",
                                "Science-Fiction", 0, Book.Status.READING);

                boolean same = book.sameAuthor(bookExpected);

                assertEquals(false, same);
        }

        /**
         * Test for sameAuthor when it is the same author and should return
         * true. The book has been read.
         */
        @Test
        public void testsameAuthor3() {
                final int dateRead = 20260814;
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy",
                                dateRead, Book.Status.READ);
                Book bookExpected = new Book1L("Poppy War", "R.F. Kuang",
                                "Fantasy", dateRead, Book.Status.READ);

                boolean same = book.sameBook(bookExpected);

                assertEquals(true, same);
        }

        /**
         * Test for sameAuthor when it is not the same author and should return
         * false. The book has been read.
         */
        @Test
        public void testsameAuthor4() {
                final int dateRead = 20260814;
                Book book = new Book1L("Knave and The Moon", "Rachel Gilig",
                                "Fantasy", dateRead, Book.Status.READ);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", dateRead, Book.Status.READ);

                boolean same = book.sameAuthor(bookExpected);

                assertEquals(false, same);
        }

        /**
         * Test for sameGenre() kernel method
         */

        /**
         * Test for sameGenre when it is the same genre and should return true.
         * The book has been read.
         */
        @Test
        public void testsameGenre1() {
                Book book = new Book1L("Knave and The Moon", "Rachel Gilig",
                                "Fantasy", 0, Book.Status.READING);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", 0, Book.Status.READING);

                boolean same = book.sameGenre(bookExpected);

                assertEquals(true, same);
        }

        /**
         * Test for sameGenre when it is not the same genre and should return
         * false. The book has been read.
         */
        @Test
        public void testsameGenre2() {
                Book book = new Book1L("Knave and The Moon", "Rachel Gilig",
                                "Fantasy", 0, Book.Status.READING);
                Book bookExpected = new Book1L("Red Rising", "Pierce Brown",
                                "Science-Fiction", 0, Book.Status.READING);

                boolean same = book.sameGenre(bookExpected);

                assertEquals(false, same);
        }

        /**
         * Test for Test for sameGenre when it is the same genre and should
         * return true. The book has been read.
         */
        @Test
        public void testsameGenre3() {
                final int dateRead = 20260814;
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy",
                                dateRead, Book.Status.READ);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", dateRead, Book.Status.READ);

                boolean same = book.sameGenre(bookExpected);

                assertEquals(true, same);
        }

        /**
         * Test for Test for sameGenre when it is not the same genre and should
         * return false. The book has been read.
         */
        @Test
        public void testsameGenre4() {
                final int dateRead = 20260814;
                Book book = new Book1L("Poppy War", "R.F. Kuang", "Fantasy",
                                dateRead, Book.Status.READ);
                Book bookExpected = new Book1L("Just For the Summer",
                                "Abby Jimenex", "Romance", dateRead,
                                Book.Status.READ);

                boolean same = book.sameBook(bookExpected);

                assertEquals(false, same);
        }

        /**
         * Test for markRead() kernel method
         */

        /**
         * Test for markRead when it is reading.
         */
        @Test
        public void testmarkRead1() {
                final int dateRead = 20260814;
                Book book = new Book1L("Knave and The Moon", "Rachel Gilig",
                                "Fantasy", 0, Book.Status.READING);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", dateRead, Book.Status.READ);

                book.markRead(dateRead);

                assertEquals(bookExpected.status(), book.status());
                assertEquals(bookExpected.dateRead(), book.dateRead());
        }

        /**
         * Test for markRead when it is want to read.
         */
        @Test
        public void testmarkRead2() {
                final int dateRead = 20260814;
                Book book = new Book1L("Knave and The Moon", "Rachel Gilig",
                                "Fantasy", 0, Book.Status.WANT_TO_READ);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", dateRead, Book.Status.READ);

                book.markRead(dateRead);

                assertEquals(bookExpected.status(), book.status());
                assertEquals(bookExpected.dateRead(), book.dateRead());
        }

        /**
         * Test for markRead when it is not in list.
         */
        @Test
        public void testmarkRead3() {
                final int dateRead = 20260814;
                Book book = new Book1L("Knave and The Moon", "Rachel Gilig",
                                "Fantasy", 0, Book.Status.NOT_IN_LIST);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", dateRead, Book.Status.READ);

                book.markRead(dateRead);

                assertEquals(bookExpected.status(), book.status());
                assertEquals(bookExpected.dateRead(), book.dateRead());
        }

        /**
         * Test for markWantToRead() kernel method
         */

        /**
         * Test for markWantToRead when it is reading.
         */
        @Test
        public void testmarkWantToRead1() {
                Book book = new Book1L("Knave and The Moon", "Rachel Gilig",
                                "Fantasy", 0, Book.Status.READING);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", 0, Book.Status.WANT_TO_READ);

                book.markWantToRead();

                assertEquals(bookExpected.status(), book.status());
        }

        /**
         * Test for markWantToRead when it is read.
         */
        @Test
        public void testmarkWantToRead2() {
                final int dateRead = 20260814;
                Book book = new Book1L("Knave and The Moon", "Rachel Gilig",
                                "Fantasy", dateRead, Book.Status.READ);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", 0, Book.Status.WANT_TO_READ);

                book.markWantToRead();

                assertEquals(bookExpected.status(), book.status());
                assertEquals(bookExpected.dateRead(), book.dateRead());
        }

        /**
         * Test for markWantRead when it is not in list.
         */
        @Test
        public void testmarkWantToRead3() {
                Book book = new Book1L("Knave and The Moon", "Rachel Gilig",
                                "Fantasy", 0, Book.Status.NOT_IN_LIST);
                Book bookExpected = new Book1L("Katabasis", "R.F. Kuang",
                                "Fantasy", 0, Book.Status.WANT_TO_READ);

                book.markWantToRead();

                assertEquals(bookExpected.status(), book.status());
        }

        /**
         * Test for isRead() kernel method
         */

        /**
         * Test for isRead,, when book is read.
         */
        @Test
        public void testisRead1() {
                final int date = 20260531;
                Book book = new Book1L("Katabasis", "R.F. Kuang", "Fantasy",
                                date, Book.Status.READ);

                Boolean read = book.isRead();

                assertEquals(true, read);
        }

        /**
         * Test for isRead, when book is want to read.
         */
        @Test
        public void testisRead2() {
                Book book = new Book1L("Morning Star", "Pierce Brown",
                                "Science-Fiction", 0, Book.Status.WANT_TO_READ);

                Boolean read = book.isRead();

                assertEquals(false, read);
        }

        /**
         * Test for isRead, when book is reading.
         */
        @Test
        public void testisRead3() {
                Book book = new Book1L("Katabasis", "R.F. Kuang", "Fantasy", 0,
                                Book.Status.READING);

                Boolean read = book.isRead();

                assertEquals(false, read);
        }

        /**
         * Test for isRead, when book is want not in list.
         */
        @Test
        public void testisRead4() {
                Book book = new Book1L("Morning Star", "Pierce Brown",
                                "Science-Fiction", 0, Book.Status.NOT_IN_LIST);

                Boolean read = book.isRead();

                assertEquals(false, read);
        }
}
