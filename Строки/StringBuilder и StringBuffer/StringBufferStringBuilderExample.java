public class StringBufferStringBuilderExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        // 1. append(String str) - добавляет строку в конец
        sb.append(" World");
        System.out.println("Append: " + sb); // Hello World

        // 2. insert(int offset, String str) - вставляет строку в указанную позицию
        sb.insert(5, ", ");
        System.out.println("Insert: " + sb); // Hello, World

        // 3. replace(int start, int end, String str) - заменяет подстроку на другую строку
        sb.replace(7, 12, "Java");
        System.out.println("Replace: " + sb); // Hello, Java

        // 4. delete(int start, int end) - удаляет подстроку
        sb.delete(7, 11);
        System.out.println("Delete: " + sb); // Hello,

        // 5. reverse() - переворачивает строку
        sb.reverse();
        System.out.println("Reverse: " + sb); // ,olleH

        // 6. capacity() - возвращает текущую емкость буфера
        System.out.println("Capacity: " + sb.capacity()); // 21

        // 7. ensureCapacity(int minimumCapacity) - увеличивает емкость буфера, если необходимо
        sb.ensureCapacity(50);
        System.out.println("Ensure Capacity: " + sb.capacity()); // 50

        // 8. setLength(int newLength) - устанавливает новую длину строки
        sb.setLength(10);
        System.out.println("Set Length: " + sb); // ,olleH

        // 9. charAt(int index) - возвращает символ по указанному индексу
        System.out.println("Char At: " + sb.charAt(2)); // l

        // 10. substring(int start) - возвращает подстроку, начиная с указанного индекса
        System.out.println("Substring: " + sb.substring(2)); // lleH

        // Примеры использования StringBuilder
        StringBuilder sb2 = new StringBuilder("Hello");

        // 1. append(String str) - добавляет строку в конец
        sb2.append(" World");
        System.out.println("Append: " + sb2); // Hello World

        // 2. insert(int offset, String str) - вставляет строку в указанную позицию
        sb2.insert(5, ", ");
        System.out.println("Insert: " + sb2); // Hello, World

        // 3. replace(int start, int end, String str) - заменяет подстроку на другую строку
        sb2.replace(7, 12, "Java");
        System.out.println("Replace: " + sb2); // Hello, Java

        // 4. delete(int start, int end) - удаляет подстроку
        sb2.delete(7, 11);
        System.out.println("Delete: " + sb2); // Hello,

        // 5. reverse() - переворачивает строку
        sb2.reverse();
        System.out.println("Reverse: " + sb2); // ,olleH

        // 6. capacity() - возвращает текущую емкость буфера
        System.out.println("Capacity: " + sb2.capacity()); // 21

        // 7. ensureCapacity(int minimumCapacity) - увеличивает емкость буфера, если необходимо
        sb2.ensureCapacity(50);
        System.out.println("Ensure Capacity: " + sb2.capacity()); // 50

        // 8. setLength(int newLength) - устанавливает новую длину строки
        sb2.setLength(10);
        System.out.println("Set Length: " + sb2); // ,olleH

        // 9. charAt(int index) - возвращает символ по указанному индексу
        System.out.println("Char At: " + sb2.charAt(2)); // l

        // 10. substring(int start) - возвращает подстроку, начиная с указанного индекса
        System.out.println("Substring: " + sb2.substring(2)); // lleH
    }
}