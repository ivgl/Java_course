import java.util.Formatter;

public class FormatterExample {
    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        // Пример использования спецификатора %b
        formatter.format("Boolean value: %b%n", true);

        // Пример использования спецификатора %c
        formatter.format("Character: %c%n", 'A');

        // Пример использования спецификатора %d
        formatter.format("Decimal integer: %d%n", 123);

        // Пример использования спецификатора %f
        formatter.format("Floating point number: %f%n", 123.456);

        // Пример использования спецификатора %s
        formatter.format("String: %s%n", "Hello, World!");

        System.out.println(formatter.toString());
    }
}