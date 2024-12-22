interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        var animal = new Dog(); // Использование var для автоматического вывода типа
        animal.makeSound();
    }
}

/*type interface в Java означает интерфейс, который определяет методы, которые должны быть реализованы классами, реализующими этот интерфейс. Интерфейсы используются для достижения абстракции и полиморфизма.

var используется для автоматического вывода типа переменной animal, которая является объектом класса Dog, реализующего интерфейс Animal.*/