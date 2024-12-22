import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Пример 1: Создание StringJoiner с разделителем
        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("Hello");
        sj1.add("World");
        System.out.println(sj1.toString()); // Hello, World

        // Пример 2: Создание StringJoiner с разделителем и префиксом/суффиксом
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("Java");
        sj2.add("Python");
        sj2.add("C++");
        System.out.println(sj2.toString()); // [Java, Python, C++]

        // Пример 3: Использование метода merge для объединения двух StringJoiner
        StringJoiner sj3 = new StringJoiner(":");
        sj3.add("Key1");
        sj3.add("Value1");

        StringJoiner sj4 = new StringJoiner(":");
        sj4.add("Key2");
        sj4.add("Value2");

        sj3.merge(sj4);
        System.out.println(sj3.toString()); // Key1:Value1:Key2:Value2
    }
}