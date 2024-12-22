class A {
    int a;

    void method() {
        System.out.println("Method in A");
    }
}

class B extends A {
    // Поля и методы не определены
}

class C extends B {
    void method() {
        int a = super.a; // Доступ к полю суперкласса A
        super.method(); // Вызов метода суперкласса A
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        C c = new C();
        c.method();
    }
}