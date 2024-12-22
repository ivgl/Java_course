public class PrimitiveTypesExample {
    public static void main(String[] args) {
        // Целочисленные типы
        byte byteVar = 0;
        short shortVar = 0;
        int intVar = 0;
        long longVar = 0L;

        // Типы с плавающей точкой
        float floatVar = 0.0f;
        double doubleVar = 0.0;

        // Символьный тип
        char charVar = '\u0000'; // Нулевой символ Unicode

        // Булевский тип
        boolean boolVar = false;

        // Примеры с ненулевыми значениями
        byteVar = 127;
        shortVar = 32767;
        intVar = 2147483647;
        longVar = 9223372036854775807L;
        floatVar = 3.14f;
        doubleVar = 3.141592653589793;
        charVar = 'A';
        boolVar = true;

        // Вывод значений
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("boolVar: " + boolVar);
    }
}