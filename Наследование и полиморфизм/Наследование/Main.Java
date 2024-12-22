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
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child(10);
        child.display();
    }
}

/*
this:
Вызывает конструкторы текущего класса.
Вызывает методы и обращаться к полям текущего класса.

super:
Вызывает конструкторы суперкласса.
Вызывает методы и обращаться к полям суперкласса. */