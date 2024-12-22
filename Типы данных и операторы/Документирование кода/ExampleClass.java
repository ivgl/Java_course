/** 
 * @author Глаголев Иван
 * @version 1.0
 * @since 2024-12-01
 */
public class ExampleClass {

    /**
     * Метод для сложения двух чисел.
     *
     * @param a первое число
     * @param b второе число
     * @return сумма двух чисел
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Метод для вычитания двух чисел.
     *
     * @param a первое число
     * @param b второе число
     * @return разность двух чисел
     * @throws ArithmeticException если b равно нулю
     */
    public int subtract(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("b cannot be zero");
        }
        return a - b;
    }

    /**
     * Основной метод для тестирования класса.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();
        System.out.println("Addition: " + example.add(5, 3));
        System.out.println("Subtraction: " + example.subtract(5, 3));
    }
}