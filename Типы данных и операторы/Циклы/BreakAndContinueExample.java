public class BreakAndContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                // Пропускаем итерацию, когда i равно 5
                continue;
            }
            if (i == 8) {
                // Выходим из цикла, когда i равно 8
                break;
            }
            System.out.println("i: " + i);
        }
    }
}