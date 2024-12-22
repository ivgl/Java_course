public class InstanceofExample {
    public static void main(String[] args) {
        String str = "Hello";
        Object obj = str;

        // Проверка, является ли объект экземпляром класса String
        if (obj instanceof String) {
            System.out.println("obj is an instance of String");
        }

        // Проверка, является ли объект экземпляром класса Object
        if (obj instanceof Object) {
            System.out.println("obj is an instance of Object");
        }

        // Проверка, является ли объект экземпляром класса Integer
        if (obj instanceof Integer) {
            System.out.println("obj is an instance of Integer");
        } else {
            System.out.println("obj is not an instance of Integer");
        }

        // Пример с null-объектом
        Object nullObj = null;
        if (nullObj instanceof String) {
            System.out.println("nullObj is an instance of String");
        } else {
            System.out.println("nullObj is not an instance of String");
        }
    }
}