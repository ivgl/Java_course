public class CustomEnumExample {
    public enum Color {
        RED("Красный"),
        GREEN("Зеленый"),
        BLACK("СЧерный");

        private String Name;

        // Конструктор для инициализации элементов перечисления
        Color(String Name) {
            this.Name = Name;
        }

        // Метод для получения названия цвета
        public String getName() {
            return Name;
        }

        // Дополнительный метод
        public boolean isWarmColor() {
            return this == RED || this == GREEN;
        }
    }

    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println("Цвет: " + color.getName());
        System.out.println("Это теплый цвет: " + color.isWarmColor());
    }
}