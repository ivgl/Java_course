public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Рефлексивность
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Не-нулевость и проверка типа
        }
        Person other = (Person) obj;
        return age == other.age && name.equals(other.name); // Симметричность и транзитивность
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }

    @Override
    public String toString() {
        return "Person name='" + name + "', age=" + age ;
    }

}