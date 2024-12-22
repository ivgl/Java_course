/*Принцип подстановки Липсов гласит, что объекты в программе должны быть заменяемы экземплярами их подтипов без изменения правильности выполнения программы. Другими словами, если S является подтипом T, то объекты типа T могут быть заменены объектами типа S без нарушения корректности программы.

Формальное определение: "Пусть q(x) является свойством, верным относительно объектов x некоторого типа T. Тогда q(y) также должно быть верным для объектов y типа S, где S является подтипом типа T."*/

// Базовый класс
class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

// Подкласс, который соответствует LSP
class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

// Подкласс, который нарушает LSP
class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich cannot fly");
    }
}

public class LSPExample {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();
        Bird bird2 = new Ostrich();

        makeBirdFly(bird1); // Это работает корректно
        makeBirdFly(bird2); // Это вызовет исключение
    }

    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }
}

/*В этом примере класс Bird имеет метод fly(), который ожидается от всех птиц. Класс Sparrow корректно переопределяет этот метод и соответствует принципу подстановки Лисков.

Однако, класс Ostrich нарушает LSP, так как страусы не умеют летать. В результате, если мы попытаемся вызвать метод fly() на объекте типа Ostrich, это вызовет исключение UnsupportedOperationException.*/