public class Book<T> implements IBook<T> {
    private T bookName;

    public Book(T bookName) {
        this.bookName = bookName;
    }

    public Book() {
    }

    @Override
    public T getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return bookName.toString();
    }
}
