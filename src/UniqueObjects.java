import java.util.Scanner;

public class UniqueObjects {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Book[] books = new Book[3];

        for (int i = 0; i < books.length;){
            Book book = createBook();
            if (isUnique(book, books)) {
                books[i] = book;
                i++;
            }else{
                System.out.println("Duplikat");
            }
        }

        for (Book book: books){
            System.out.println(book);
        }

    }

    private static boolean isUnique(Book book, Book[] books) {
        for (Book b : books) {
            if (book.equals(b)) {
                return false;
            }
            } return true;
        }

    private static Book createBook() {
        System.out.println("Podaj tytuł");
        String title = scanner.nextLine();
        System.out.println("Podaj ilość stron");
        int pages = scanner.nextInt();
        scanner.nextLine();
        return new Book(title, pages);
    }
}

