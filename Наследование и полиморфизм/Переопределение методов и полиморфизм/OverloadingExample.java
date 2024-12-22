public class OverloadingExample {
    // Перегруженные методы
    public void print(int i) {
        System.out.println("Printing int: " + i);
    }

    public void print(double d) {
        System.out.println("Printing double: " + d);
    }

    public void print(String s) {
        System.out.println("Printing String: " + s);
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();
        example.print(10); // Вызов метода с параметром int
        example.print(10.5); // Вызов метода с параметром double
        example.print("Hello"); // Вызов метода с параметром String
    }
}