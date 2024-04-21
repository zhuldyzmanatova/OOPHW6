/*
 * данный класс был создан по принципу единственной ответственности, чтобы разделить задачи, 
 * которые до этого выполнял только класс Library
 */
import java.util.List;

public class LibraryDisplay<T extends IBook> {
    public void showBooks(String header, List<T> books) {
        System.out.println(header);
        for (T book : books) {
            System.out.println(book);
        }
    }
}
