import java.util.Date;

public class Book implements Comparable<Book>{
    private String bookName;
    private Integer countPage;
    private String authorName;
    private String releaseDate;

    public Book(String bookName, Integer countPage, String authorName, String releaseDate) {
        this.bookName = bookName;
        this.countPage = countPage;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getCountPage() {
        return countPage;
    }

    public void setCountPage(Integer countPage) {
        this.countPage = countPage;
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

    @Override
    public int compareTo(Book book) {
        return getBookName().compareTo(book.getBookName());
    }
}
