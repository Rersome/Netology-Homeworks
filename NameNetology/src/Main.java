import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя автора: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию автора: ");
        String surname = scanner.nextLine();
        System.out.println("Введите рейтинг автора: ");
        int rating = scanner.nextInt();
        System.out.println("Введите количество страниц в книге: ");
        int pages = scanner.nextInt();
        System.out.println("Введите год выпуска книги: ");
        int releaseYear = scanner.nextInt();

        Author author = new Author(name, surname, rating);
        Book book = new Book("Adventure", author, pages, releaseYear);
        System.out.println(book.matches("Oleg"));
        System.out.println(book.estimatePrice(book.pages));
        System.out.println(book.isBig(book.pages));
    }
}