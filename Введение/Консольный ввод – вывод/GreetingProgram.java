import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода из консоли
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести свое имя
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        // Выводим приветственное сообщение
        System.out.println("Привет, " + name);

        // Закрываем сканер
        scanner.close();
    }
}