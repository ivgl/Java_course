final class FinalClass {
    public void display() {
        System.out.println("Display method in FinalClass");
    }
}

// Попытка создать подкласс от final-класса вызовет ошибку компиляции
// class SubClass extends FinalClass {
//     public void display() {
//         System.out.println("Display method in SubClass");
//     }
// }

public class FinalExtends {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.display(); // Вызов метода из final-класса
    }
}

/*
FinalClass:
    Объявлен как final, что запрещает создание подклассов.
    Содержит метод display.

Попытка создать подкласс SubClass:
    Попытка создать подкласс от final-класса FinalClass вызовет ошибку компиляции. */