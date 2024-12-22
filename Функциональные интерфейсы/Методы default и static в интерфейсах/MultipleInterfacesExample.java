interface InterfaceA {
    default void commonMethod() {
        System.out.println("Common method in InterfaceA");
    }
}

interface InterfaceB {
    default void commonMethod() {
        System.out.println("Common method in InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // Переопределение метода commonMethod для разрешения конфликта
    @Override
    public void commonMethod() {
        System.out.println("Overridden common method in MyClass");
    }
}

public class MultipleInterfacesExample {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.commonMethod();
    }
}

/*Конфликт методов:

Если класс реализует два интерфейса с одинаковыми неабстрактными методами, возникает конфликт. Компилятор не знает, какую реализацию метода использовать.

Разрешение конфликта:

Чтобы разрешить конфликт, необходимо переопределить метод в классе, реализующем оба интерфейса.
В данном примере метод commonMethod переопределен в классе MyClass.

Вызов метода:

В методе main класса MultipleInterfacesExample создается экземпляр класса MyClass и вызывается метод commonMethod, который был переопределен в MyClass. */