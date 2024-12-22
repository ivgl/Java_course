public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Генерация первого исключения
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        // Генерация второго исключения
        String str = null;
        int length = str.length(); // NullPointerException
    }
}

/*
Первое исключение (ArithmeticException):
В блоке try происходит деление на ноль, что вызывает ArithmeticException.
Это исключение перехватывается в блоке catch и выводится сообщение об ошибке.
Блок finally выполняется в любом случае, независимо от того, было ли перехвачено исключение или нет.

Второе исключение (NullPointerException):
Вне блока try-catch-finally происходит попытка вызова метода length() на null объекте, что вызывает NullPointerException.
Это исключение не перехватывается, что приводит к аварийной остановке приложения. */