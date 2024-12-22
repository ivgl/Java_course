public class MethodOverloadingExample {

    // Метод без параметров
    public void display() {
        System.out.println("No parameters");
    }

    // Метод с одним параметром
    public void display(int a) {
        System.out.println("One parameter: " + a);
    }

    // Метод с двумя параметрами
    public void display(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }

    // Метод с параметром типа String
    public void display(String message) {
        System.out.println("String parameter: " + message);
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

        example.display(); // Вызов метода без параметров
        example.display(10); // Вызов метода с одним параметром
        example.display(10, 20); // Вызов метода с двумя параметрами
        example.display("Hello, World!"); // Вызов метода с параметром типа String
    }
}