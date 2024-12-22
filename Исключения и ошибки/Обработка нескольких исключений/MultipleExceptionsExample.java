class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class MultipleExceptionsExample {
    public static void main(String[] args) {
        try {
            // Генерация исключения Ex1
            throw new Ex1();
        } catch (Ex1 | Ex2 | Ex3 e) {
            // Обработка исключений Ex1, Ex2 и Ex3 абсолютно идентичным образом
            System.out.println("Caught an exception of type Ex1, Ex2, or Ex3: " + e.getClass().getName());
        }

        try {
            // Генерация исключения Ex2
            throw new Ex2();
        } catch (Ex1 e) {
            // Обработка исключений Ex1 и его подклассов
            System.out.println("Caught an exception of type Ex1 or its subclass: " + e.getClass().getName());
        }

        try {
            // Генерация исключения Ex3
            throw new Ex3();
        } catch (Ex1 e) {
            // Обработка исключений Ex1 и его подклассов
            System.out.println("Caught an exception of type Ex1 or its subclass: " + e.getClass().getName());
        }
    }
}