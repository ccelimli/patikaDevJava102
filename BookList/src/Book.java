public class Book {
    private String bookName;
    private int numbersOfPages;
    private String authorName;
    private String releaseDate;

    public Book() {
    }

    public Book(String bookName, int numbersOfPages, String authorName, String releaseDate) {
        this.bookName = bookName;
        this.numbersOfPages = numbersOfPages;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumbersOfPages() {
        return numbersOfPages;
    }

    public void setNumbersOfPages(int numbersOfPages) {
        this.numbersOfPages = numbersOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
