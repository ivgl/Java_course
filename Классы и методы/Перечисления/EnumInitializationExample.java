public class EnumInitializationExample {
    public enum Day {
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");

        private String Name;

        // Конструктор для инициализации элементов перечисления
        Day(String Name) {
            this.Name = Name;
        }

        // Метод для получения названия дня
        public String getName() {
            return Name;
        }
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println("День недели: " + day.getName());
    }
}