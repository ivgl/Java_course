public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. length() - возвращает длину строки
        System.out.println("Length: " + str.length()); // 13

        // 2. charAt(int index) - возвращает символ по указанному индексу
        System.out.println("Character at index 4: " + str.charAt(4)); // o

        // 3. substring(int beginIndex) - возвращает подстроку, начиная с указанного индекса
        System.out.println("Substring from index 7: " + str.substring(7)); // World!

        // 4. substring(int beginIndex, int endIndex) - возвращает подстроку, начиная с beginIndex и заканчивая endIndex
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12)); // World

        // 5. concat(String str) - объединяет две строки
        System.out.println("Concatenation: " + str.concat(" Welcome to Java!")); // Hello, World! Welcome to Java!

        // 6. replace(CharSequence target, CharSequence replacement) - заменяет все вхождения target на replacement
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java")); // Hello, Java!

        // 7. toLowerCase() - преобразует все символы строки в нижний регистр
        System.out.println("To lower case: " + str.toLowerCase()); // hello, world!

        // 8. toUpperCase() - преобразует все символы строки в верхний регистр
        System.out.println("To upper case: " + str.toUpperCase()); // HELLO, WORLD!

        // 9. trim() - удаляет пробелы в начале и в конце строки
        String strWithSpaces = "   Hello, World!   ";
        System.out.println("Trim: '" + strWithSpaces.trim() + "'"); // Hello, World!

        // 10. split(String regex) - разбивает строку на массив подстрок по указанному регулярному выражению
        String[] words = str.split(", ");
        System.out.println("Split: " + words[0] + " | " + words[1]); // Hello | World!
    }
}