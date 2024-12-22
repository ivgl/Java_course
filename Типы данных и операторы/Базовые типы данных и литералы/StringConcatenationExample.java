public class StringConcatenationExample {
    public static void main(String[] args) {
        String str = "Привет, ";
        int age = 30;
        double height = 1.75;
        boolean isStudent = false;

        String result = str + "мне " + age + " лет, мой рост " + height + " метра, и я " + (isStudent ? "студент" : "не студент");
        System.out.println(result);
    }
}