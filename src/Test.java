import java.time.LocalDate;
import java.time.Year;

/**
 * @author Drumstyle92
 * class that contains the program.
 */
public class Test {
    /**
     * @param args main parameter.
     * main method where we have a date, methods on years and months.
     */
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("----------------------------Today---------------------------------");
        System.out.println(today);

        // how many days are left till the end of the month
        System.out.println("----------------------------DaysMonth------------------------------");
        int diffMonth = today.lengthOfMonth() - today.getDayOfMonth();
        System.out.println(diffMonth);

        // how many days are left till the end of the year
        System.out.println("----------------------------DaysYear--------------------------------");
        int diffYear = java.time.Year.of(today.getYear()).length() - today.getDayOfYear();
        System.out.println(diffYear);
    }
}
