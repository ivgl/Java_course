class A {
    public static void method() {
        System.out.println("Static method in A");
    }
}

class B extends A {
    // Попытка переопределить статический метод приведет к ошибке компиляции
    // @Override
    public static void method() {
        System.out.println("Static method in B");
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = new B();

        a.method(); // Вызов метода класса A
        b.method(); // Вызов метода класса B
        ab.method(); // Вызов метода класса A, так как метод статический
    }
}