public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = "Hello";
        try {
            Integer num = (Integer) obj; // Неправильное приведение типа
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }
}