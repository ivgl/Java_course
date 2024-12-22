public class BooleanExample {
    public static void main(String[] args) {
        // Использование метода valueOf(boolean)
        Boolean bool1 = Boolean.valueOf(true);
        System.out.println("bool1: " + bool1);

        // Использование метода valueOf(String)
        Boolean bool2 = Boolean.valueOf("true");
        System.out.println("bool2: " + bool2);

        // Использование метода parseBoolean(String)
        Boolean bool3 = Boolean.parseBoolean("true");
        System.out.println("bool3: " + bool3);

        // Использование метода decode(String)
        Boolean bool4 = Boolean.decode("true");
        System.out.println("bool4: " + bool4);
    }
}