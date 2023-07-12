import exercises1v2.Book;
import exercises1v2.Threads;
import exercises1v4.Fixture;
import exercises1v4.FixtureGenerator;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Book> books = new ArrayList<>();
//        books.add(new Book("Kürk Mantolu Madonna",300,"Sabahattin Ali","1996"));
//        books.add(new Book("Hayvan Çiftliği",370,"George Orwell","2000"));
//        books.add(new Book("Satranç",500,"Stefan Zweig","1997"));
//        books.add(new Book("Küçük Prens",250,"Antoine de SaintExupery","2001"));
//        books.add(new Book("Şeker Portakalı",270,"Jose Mauro De Vanconcelos","2000"));
//        books.add(new Book("Dönüşüm",700,"Franz Kafka","2002"));
//        books.add(new Book("Simyacı",400,"Paulo Coelho","2013"));
//        books.add(new Book("Fareler ve İnsanlar",600,"John Steinbeck","1980"));
//        books.add(new Book("1984",550,"George Orwell","1998"));
//        books.add(new Book("Suç ve Ceza",900,"Fyodor Dostoyevski","2003"));
//
//        Map<String, String> bookMap = new HashMap<>();
//
//        books.forEach(book -> bookMap.put(book.getName(),book.getAuthor()));
//        bookMap.forEach((name, author) -> System.out.println("Book : " + name +" Author : "+ author));
//
//        List<Book> bookList = books.stream().filter(book -> book.getPageSize() > 600).toList();
//        bookList.forEach((book) -> System.out.println("600 PAGESIZE BOOK : "+ book.getName() + "AUTHOR : " + book.getAuthor()));

//
//        Threads threads = new Threads();
//
//        ExecutorService executorService = Executors.newFixedThreadPool(12);
//
//        for (int i = 0; i < 1000; i++) {
//            executorService.execute(threads);
//        }
//        executorService.shutdown();
//        try {
//            executorService.awaitTermination(5, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        FixtureGenerator<String> fixtureGenerator = new FixtureGenerator();
        List<String> teams = new LinkedList<String>();

        teams.add("Galatasaray");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Trabzonspor");

        List<List<Fixture<String>>> rounds = fixtureGenerator.getFixtures(teams, true);

        for (int i = 0; i < rounds.size(); i++) {
            System.out.println("Round " + (i + 1));
            List<Fixture<String>> round = rounds.get(i);
            for (Fixture<String> fixture : round) {
                System.out.println(fixture.getHomeTeam() + " vs " + fixture.getAwayTeam());
            }
            System.out.println("");
        }
    }
}