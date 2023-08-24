import java.util.Comparator;

public class OrderPageNumberComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getCountPage()-o2.getCountPage();
    }
}
