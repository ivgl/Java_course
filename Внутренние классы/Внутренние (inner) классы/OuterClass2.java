public class OuterClass2 {
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

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // Создание экземпляра внутреннего класса
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
/*Внутренний класс InnerClass объявлен как нестатический внутренний класс.
Имеет доступ к полям и методам внешнего класса OuterClass.*/