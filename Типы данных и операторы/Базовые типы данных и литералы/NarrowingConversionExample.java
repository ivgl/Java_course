public class NarrowingConversionExample {
    public static void main(String[] args) {
        int intVar = 1000;
        byte byteVar = (byte) intVar; // Сужение int -> byte
        short shortVar = (short) intVar; // Сужение int -> short

        System.out.println("byteVar: " + byteVar); // Ожидаемое значение: -24
        System.out.println("shortVar: " + shortVar); // Ожидаемое значение: 1000
    }
}