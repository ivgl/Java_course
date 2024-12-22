public class OuterClass1 {
    private String outerField = "Outer Field";

    // Внутренний класс
    private class InnerClass {
        private String innerField = "Inner Field";

        public void display() {
            System.out.println("InnerClass: " + innerField);
            // Доступ к полю внешнего класса
            System.out.println("OuterClass: " + outerField);
        }
    }

    // Вложенный класс
    private static class NestedClass {
        private String nestedField = "Nested Field";

        public static void display() {
            System.out.println("NestedClass: " + nestedField);
            // Доступ к полю внешнего класса
            // System.out.println("OuterClass: " + outerField); // Ошибка компиляции
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // Создание экземпляра внутреннего класса
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        // Вызов статического метода вложенного класса
        OuterClass.NestedClass.display();
    }
}


/*
InnerClass:
Объявлен как нестатический внутренний класс.
Имеет доступ к полям и методам внешнего класса OuterClass.

NestedClass:
Объявлен как статический вложенный класс.
Не имеет доступа к полям и методам внешнего класса OuterClass. */