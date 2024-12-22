public class UnicodeExample {
    public static void main(String[] args) {
        // Пример имени "Иван" в формате Unicode
        char[] name = {'\u0418', '\u0432', '\u0430', '\u043D'};
        for (char c : name) {
            System.out.print(c);
        }
    }
}