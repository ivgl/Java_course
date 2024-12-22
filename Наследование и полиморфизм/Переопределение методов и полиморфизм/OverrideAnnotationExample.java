class Parent {
    public void display() {
        System.out.println("Display method in Parent");
    }
}

class Child extends Parent {
    // Ошибка компиляции: метод не переопределяет метод суперкласса
    // @Override
    // public void show() {
    //     System.out.println("Display method in Child");
    // }
}

public class OverrideAnnotationExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Вызов метода суперкласса
    }
}

/*
Если метод show в классе Child помечен аннотацией @Override, но не переопределяет метод суперкласса, это приведет к ошибке компиляции. Аннотация @Override помогает обнаружить ошибку, если метод не переопределяет метод суперкласса. */