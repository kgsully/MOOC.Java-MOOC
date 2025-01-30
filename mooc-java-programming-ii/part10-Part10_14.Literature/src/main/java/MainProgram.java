
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.isBlank()) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, age));
            System.out.println();
        }

        Comparator<Book> comparator = Comparator
                                        .comparing(Book::getAge)
                                        .thenComparing(Book::getTitle);

        System.out.println("\n" + books.size() + " books in total.\n");
        System.out.println("Books:");

        Collections.sort(books, comparator);

        books.stream()
            .forEach(book -> System.out.println(book));

        // Part 2 code
        // books.stream()
        //     .sorted((b1, b2) -> b1.getAge() - b2.getAge())
        //     .forEach(book -> System.out.println(book));
    }

}
