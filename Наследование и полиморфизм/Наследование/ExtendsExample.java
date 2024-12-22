class A {
    int a1;
    public int a2;
    protected int a3;
    private int a4;

    void method1() {
        System.out.println("A.method1");
    }

    public void method2() {
        System.out.println("A.method2");
    }

    protected void method3() {
        System.out.println("A.method3");
    }

    private void method4() {
        System.out.println("A.method4");
    }
}

class B extends A {
    void accessFieldsAndMethods() {
        a1 = 1; // Доступен, так как находится в том же пакете
        a2 = 2; // Доступен, так как public
        a3 = 3; // Доступен, так как protected
        // a4 = 4; // Недоступен, так как private

        method1(); // Доступен, так как находится в том же пакете
        method2(); // Доступен, так как public
        method3(); // Доступен, так как protected
        // method4(); // Недоступен, так как private
    }
}

class C extends B {
    void accessFieldsAndMethods() {
        a1 = 1; // Доступен, так как находится в том же пакете
        a2 = 2; // Доступен, так как public
        a3 = 3; // Доступен, так как protected
        // a4 = 4; // Недоступен, так как private

        method1(); // Доступен, так как находится в том же пакете
        method2(); // Доступен, так как public
        method3(); // Доступен, так как protected
        // method4(); // Недоступен, так как private
    }
}