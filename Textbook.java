public class Textbook<T> extends Book<T> {
    private T textbookName;
    private int grade;

    public Textbook(T textbookName, int grade) {
        super(textbookName);
        this.textbookName = textbookName;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return textbookName.toString() + ", " + grade + " класс";
    }
}
