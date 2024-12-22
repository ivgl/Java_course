interface MyInterface {
    // Неабстрактный метод
    default void defaultMethod() {
        System.out.println("This is a default method in MyInterface");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("This is a static method in MyInterface");
    }
}

class MyClass implements MyInterface {
    // Реализация интерфейса
}

public class InterfaceExample {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Вызов неабстрактного метода через экземпляр класса
        myClass.defaultMethod();

        // Вызов статического метода через имя интерфейса
        MyInterface.staticMethod();
    }
}