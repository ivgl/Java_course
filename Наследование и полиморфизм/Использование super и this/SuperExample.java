class Parent {
    int value;

    Parent(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("Parent value: " + value);
    }
}

class Child extends Parent {
    int value;

    Child(int value) {
        super(value); // Вызов конструктора суперкласса
        this.value = value; // Инициализация поля текущего класса
    }

    @Override
    void display() {
        super.display(); // Вызов метода суперкласса
        System.out.println("Child value: " + this.value);
    }

    void showParentValue() {
        System.out.println("Parent value from Child: " + super.value); // Доступ к полю суперкласса
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child child = new Child(10);
        child.display();
        child.showParentValue();
    }
}