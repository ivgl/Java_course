public class A {
    // Инициализация при объявлении
    public final int a = 10;

    // Конструктор для инициализации через конструктор
    public A(int a) {
        this.a = a;
    }

    // Конструктор по умолчанию для инициализации в блоке инициализации экземпляра
    public A() {
        // Блок инициализации экземпляра
        {
            a = 10; // Инициализация final переменной
        }
    }

    public static void main(String[] args) {
        // Инициализация через конструктор
        A instance1 = new A(5);
        System.out.println("a (initialized through constructor): " + instance1.a); // Вывод: a: 5

        // Инициализация в блоке инициализации экземпляра
        A instance2 = new A();
        System.out.println("a (initialized in instance block): " + instance2.a); // Вывод: a: 10

        // Инициализация при объявлении
        A instance3 = new A();
        System.out.println("a (initialized at declaration): " + instance3.a); // Вывод: a: 10
    }
}