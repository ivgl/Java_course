public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            if (true) {
                throw new IllegalArgumentException("Invalid argument");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }
}