public class DecodeExample {
    public static void main(String[] args) {
        // Примеры использования метода decode()
        Integer value1 = Integer.decode("12");
        System.out.println("value1: " + value1); // 12

        Integer value2 = Integer.decode("0x12");
        System.out.println("value2: " + value2); // 18 (шестнадцатеричное число)

        Integer value3 = Integer.decode("012");
        System.out.println("value3: " + value3); // 10 (восьмеричное число)

        Integer value4 = Integer.decode("0b1100");
        System.out.println("value4: " + value4); // 12 (двоичное число)
    }
}