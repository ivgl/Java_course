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

public class FinalOverride {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.display(); // Вызов метода из final-класса
    }
}

/*
Parent:
    Содержит final-метод finalMethod.
    final-метод не может быть переопределен в подклассе.

Сhild:
    Попытка переопределить final-метод finalMethod вызовет ошибку компиляции.*/