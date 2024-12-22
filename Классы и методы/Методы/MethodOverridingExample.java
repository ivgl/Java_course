class Animal {
    // Метод в суперклассе
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Переопределение метода в подклассе
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Переопределение метода в подклассе
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Вызов метода суперкласса
        myDog.makeSound(); // Вызов переопределенного метода в подклассе Dog
        myCat.makeSound(); // Вызов переопределенного метода в подклассе Cat
    }
}