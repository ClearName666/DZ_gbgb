import java.util.HashMap;

/**
 * DZ
 */
public class DZ {

    public static void main(String[] args) {
        TelBook telBook = new TelBook();
        telBook.add("павел", 123456);
        telBook.add("павел", 123456);
        telBook.add("павел", 123456);
        telBook.add("настя", 654321);
        telBook.print();

    }
}