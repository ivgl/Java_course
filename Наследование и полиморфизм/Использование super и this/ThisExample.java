class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(0, 0, 0); // Вызов конструктора с тремя параметрами
    }

    public A(int a) {
        this(a, 0, 0); // Вызов конструктора с тремя параметрами
    }

    public A(int a, int b) {
        this(a, b, 0); // Вызов конструктора с тремя параметрами
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;
    }
}

public class ThisExample {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(1);
        A a3 = new A(1, 2);
        A a4 = new A(1, 2, 3);

        System.out.println("a1: a=" + a1.a + ", b=" + a1.b + ", c=" + a1.c + ", z=" + a1.z);
        System.out.println("a2: a=" + a2.a + ", b=" + a2.b + ", c=" + a2.c + ", z=" + a2.z);
        System.out.println("a3: a=" + a3.a + ", b=" + a3.b + ", c=" + a3.c + ", z=" + a3.z);
        System.out.println("a4: a=" + a4.a + ", b=" + a4.b + ", c=" + a4.c + ", z=" + a4.z);
    }
}