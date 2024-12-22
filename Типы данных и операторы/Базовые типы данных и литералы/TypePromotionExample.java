public class TypePromotionExample {
    public static void main(String[] args) {
        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 30;
        long longVar = 40L;
        float floatVar = 50.0f;
        double doubleVar = 60.0;

        // Примеры арифметических операций
        int result1 = byteVar + shortVar; // byte -> short -> int
        long result2 = intVar + longVar; // int -> long
        float result3 = floatVar + intVar; // int -> float
        double result4 = doubleVar + floatVar; // float -> double

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
    }
}