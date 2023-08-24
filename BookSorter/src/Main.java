import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book>  books= new TreeSet<>();
        Book firstBook= new Book("2. Kitap",234,"1. Yazar","2015");
        Book secondBook= new Book("4. Kitap",152,"2. Yazar","2010");
        Book thirdBook= new Book("1. Kitap",855,"3. Yazar","2019");
        Book fourthBook=new Book("5. Kitap",412,"4. Yazar","2008");
        Book fifthBook= new Book("3. Kitap",254,"5. Yazar","2022");

        for (Book book: books){
            System.out.println("Book Name: "+book.getBookName()+
                               " --- Count Of Page: "+book.getCountPage()+
                               " --- Author Name: "+book.getAuthorName()+
                               " --- Release Date: "+book.getReleaseDate());
        }

        System.out.println("------------------------------");

        TreeSet<Book> bookTreeSet = new TreeSet<>(new OrderPageNumberComparator().reversed());
        bookTreeSet.add(firstBook);
        bookTreeSet.add(secondBook);
        bookTreeSet.add(thirdBook);
        bookTreeSet.add(fourthBook);
        bookTreeSet.add(fifthBook);

        for (Book book: bookTreeSet){
            System.out.println("Book Name: "+book.getBookName()+
                               " --- Count Of Page: "+book.getCountPage()+
                               " --- Author Name: "+book.getAuthorName()+
                               " --- Release Date: "+book.getReleaseDate());
        }
    }
}