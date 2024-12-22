import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        // Проверка типа с использованием instanceof
        if (intList instanceof List<?>) {
            System.out.println("intList is a List");
        }

        if (stringList instanceof List<?>) {
            System.out.println("stringList is a List");
        }

        // Проверка типа с использованием instanceof и конкретного типа
        if (intList instanceof List<Integer>) {
            System.out.println("intList is a List of Integer");
        }

        if (stringList instanceof List<String>) {
            System.out.println("stringList is a List of String");
        }
    }
}