import java.util.Formatter;

public class FormatterFlushExample {
    public static void main(String[] args) {
        // Создаем объект Formatter
        Formatter formatter = new Formatter();

        // Форматируем данные
        formatter.format("Boolean value: %b%n", true);
        formatter.format("Character: %c%n", 'A');

        // Очищаем буфер и записываем данные
        formatter.flush();

        System.out.println(formatter.toString());
    }
}