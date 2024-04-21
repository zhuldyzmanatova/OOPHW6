/*
 * здесь класс Book используется в качестве параметра типа T, который является подтипом IBook, 
 * и в классе Main видно, что методы классы Library и TextbookLibrary могут работать с любым объектом, 
 * который реализует интерфейс IBook (такие как Book и Textbook), по принципу подстановки классов
 */
import java.util.ArrayList;
import java.util.List;

public class Library<T extends IBook> implements ILibrary<T> {
    private List<T> books = new ArrayList<>();
    private List<T> givenBooks = new ArrayList<>();

    @Override
    public void addBook(T book) {
        books.add(book);
    }

    @Override
    public void giveBook(T book) {
        books.remove(book);
        givenBooks.add(book);
    }

    public List<T> getGivenBooks() {
        return givenBooks;
    }

    public List<T> getRemainedBooks() {
        return books;
    }
}
