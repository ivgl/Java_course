public interface MyInterface {
    void display();
}

public class OuterClass {
    public static class NestedClass implements MyInterface {
        @Override
        public void display() {
            System.out.println("NestedClass display method");
        }
    }

    public static void main(String[] args) {
        MyInterface nested = new NestedClass();
        nested.display(); // Вызов метода интерфейса
    }
}

/*Вложенный класс NestedClass реализует интерфейс MyInterface.
Метод display интерфейса MyInterface вызывается через экземпляр вложенного класса NestedClass. */