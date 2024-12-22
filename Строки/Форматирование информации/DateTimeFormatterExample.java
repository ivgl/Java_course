import java.util.Formatter;
import java.util.Calendar;

public class DateTimeFormatterExample {
    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        Calendar calendar = Calendar.getInstance();

        // Пример использования спецификатора %tH
        formatter.format("Hour (00-23): %tH%n", calendar);

        // Пример использования спецификатора %tM
        formatter.format("Minutes: %tM%n", calendar);

        // Пример использования спецификатора %tS
        formatter.format("Seconds: %tS%n", calendar);

        // Пример использования спецификатора %tY
        formatter.format("Year (four digits): %tY%n", calendar);

        // Пример использования спецификатора %tB
        formatter.format("Full month name: %tB%n", calendar);

        System.out.println(formatter.toString());
    }
}