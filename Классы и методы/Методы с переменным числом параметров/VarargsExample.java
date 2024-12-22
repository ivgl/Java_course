public class VarargsExample {

    // Метод с переменным числом параметров типа int
    public static void printNumbers(int... numbers) {
        System.out.println("Printing int numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // Метод с переменным числом параметров типа double
    public static void printNumbers(double... numbers) {
        System.out.println("Printing double numbers:");
        for (double num : numbers) {
            System.out.println(num);
        }
    }


    public static void main(String[] args) {
        // Примеры вызова перегруженных методов
        printNumbers(1, 2, 3, 4, 5);
        printNumbers(1.1, 2.2, 3.3, 4.4, 5.5);
    }
}