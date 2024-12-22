class Parent {
    public void display() {
        System.out.println("Display method in Parent");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Display method in Child");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Вызов метода суперкласса

        Child child = new Child();
        child.display(); // Вызов переопределенного метода подкласса

        Parent parentRef = new Child();
        parentRef.display(); // Вызов переопределенного метода подкласса через ссылку суперкласса
    }
}

/*
Если тип возвращаемого значения переопределенного метода не совпадает с типом возвращаемого значения переопределяемого метода, это приведет к ошибке компиляции.


class Parent {
    public int getValue() {
        return 1;
    }
}

class Child extends Parent {
    // Ошибка компиляции: тип возвращаемого значения не совпадает
    // @Override
    // public String getValue() {
    //     return "1";
    // }
} */