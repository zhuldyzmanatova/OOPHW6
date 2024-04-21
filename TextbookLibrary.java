import java.util.ArrayList;
import java.util.List;

public class TextbookLibrary<T extends Textbook> extends Library<T> {
    public void addBooks(List<T> textbooks) {
        for (T textbook : textbooks) {
            addBook(textbook);
        }
    }

    public void giveBooks(List<T> textbooks) {
        for (T textbook : textbooks) {
            giveBook(textbook);
        }
    }

    public List<T> getBooksByGrade(int grade) {
        List<T> booksByGrade = new ArrayList<>();
        for (T textbook : getRemainedBooks()) {
            if (textbook.getGrade() == grade) {
                booksByGrade.add(textbook);
            }
        }
        return booksByGrade;
    }
}
