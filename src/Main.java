import exercises1v2.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Kürk Mantolu Madonna",300,"Sabahattin Ali","1996"));
        books.add(new Book("Hayvan Çiftliği",370,"George Orwell","2000"));
        books.add(new Book("Satranç",500,"Stefan Zweig","1997"));
        books.add(new Book("Küçük Prens",250,"Antoine de SaintExupery","2001"));
        books.add(new Book("Şeker Portakalı",270,"Jose Mauro De Vanconcelos","2000"));
        books.add(new Book("Dönüşüm",700,"Franz Kafka","2002"));
        books.add(new Book("Simyacı",400,"Paulo Coelho","2013"));
        books.add(new Book("Fareler ve İnsanlar",600,"John Steinbeck","1980"));
        books.add(new Book("1984",550,"George Orwell","1998"));
        books.add(new Book("Suç ve Ceza",900,"Fyodor Dostoyevski","2003"));

        Map<String, String> bookMap = new HashMap<>();

        books.forEach(book -> bookMap.put(book.getName(),book.getAuthor()));
        bookMap.forEach((name, author) -> System.out.println("Book : " + name +" Author : "+ author));

        List<Book> bookList = books.stream().filter(book -> book.getPageSize() > 600).toList();
        bookList.forEach((book) -> System.out.println("600 PAGESIZE BOOK : "+ book.getName() + "AUTHOR : " + book.getAuthor()));
    }
}