import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList= new ArrayList<>();
        bookList.add(new Book("1. Kitap",256,"1. Yazar","2010"));
        bookList.add(new Book("2. Kitap",46,"2. Yazar","2011"));
        bookList.add(new Book("3. Kitap",679,"3. Yazar","2012"));
        bookList.add(new Book("4. Kitap",69,"4. Yazar","2013"));
        bookList.add(new Book("5. Kitap",364,"5. Yazar","2014"));
        bookList.add(new Book("6. Kitap",85,"6. Yazar","2015"));
        bookList.add(new Book("7. Kitap",1235,"7. Yazar","2016"));
        bookList.add(new Book("8. Kitap",78,"8. Yazar","2017"));
        bookList.add(new Book("9. Kitap",988,"9. Yazar","2018"));
        bookList.add(new Book("10. Kitap",468,"10. Yazar","2019"));

        Map<String,String> mapList= new HashMap<>();

        bookList.forEach(book -> mapList.put(book.getBookName(),book.getAuthorName()));
        mapList.forEach((bookName,authorName)-> System.out.println("Kitap: "+bookName+" - "+"Author: "+authorName));
        System.out.println("\n#########################################\n");
        List<Book> booksByList=bookList.stream().filter(book ->book.getNumbersOfPages()>100 ).toList();
        System.out.println("Books By Filter");
        booksByList.forEach(book -> System.out.println("Kitap Adı: "+book.getBookName()+" - "+"Sayfa Sayısı: "+book.getNumbersOfPages()));
    }
}