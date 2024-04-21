import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book<Integer> book1 = new Book<>(1984);
        Book<String> book2 = new Book<>("100 лет одиночества");
        Book<String> book3 = new Book<>("Война и мир");
        Book<String> book4 = new Book<>("11/22/1963");
        Book<String> book5 = new Book<>("Двадцать тысяч лье под водой");
        Book<String> book6 = new Book<>("100 дней до приказа");

        ILibrary<IBook> library = new Library<>();
        LibraryDisplay<IBook> libraryDisplay = new LibraryDisplay<>();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        library.giveBook(book1);
        library.giveBook(book4);
        library.giveBook(book5);

        libraryDisplay.showBooks("Выданные книги:", ((Library<IBook>) library).getGivenBooks());
        libraryDisplay.showBooks("Книги в наличии:", ((Library<IBook>) library).getRemainedBooks());
        System.out.println("--------------------------");

        Textbook<String> textbook1 = new Textbook<>("Алгебра", 7);
        Textbook<String> textbook2 = new Textbook<>("Литература", 7);
        Textbook<String> textbook3 = new Textbook<>("Химия", 7);
        Textbook<String> textbook4 = new Textbook<>("Биология", 8);
        Textbook<String> textbook5 = new Textbook<>("Физика", 8);
        Textbook<String> textbook6 = new Textbook<>("История", 8);
        Textbook<String> textbook7 = new Textbook<>("Алгебра", 9);
        Textbook<String> textbook8 = new Textbook<>("Химия", 9);
        Textbook<String> textbook9 = new Textbook<>("История", 9);
        Textbook<String> textbook10 = new Textbook<>("Литература", 9);

       
        List<Textbook> textbooks7List = Arrays.asList(textbook1, textbook2, textbook3);
        List<Textbook> textbooks8List = Arrays.asList(textbook4, textbook5, textbook6);
        List<Textbook> textbooks9List = Arrays.asList(textbook7, textbook8, textbook9, textbook10);

        TextbookLibrary<Textbook> textbookLibrary = new TextbookLibrary<>();
        
        textbookLibrary.addBooks(textbooks7List);
        textbookLibrary.addBooks(textbooks8List);
        textbookLibrary.addBooks(textbooks9List);

        System.out.println("Учебники за 7 класс: \n" + textbookLibrary.getBooksByGrade(7));
        System.out.println("Учебники за 8 класс: \n" + textbookLibrary.getBooksByGrade(8));
        System.out.println("Учебники за 9 класс: \n" + textbookLibrary.getBooksByGrade(9));
        System.out.println("--------------------------");

        textbookLibrary.giveBooks(textbooks7List);
        textbookLibrary.giveBooks(textbooks9List);

        LibraryDisplay<Textbook> textbookLibraryDisplay = new LibraryDisplay<>();
        textbookLibraryDisplay.showBooks("Выданные учебники:", textbookLibrary.getGivenBooks());
        System.out.println("--------------------------");
        textbookLibraryDisplay.showBooks("Учебники в наличии:", textbookLibrary.getRemainedBooks());
    }
}
