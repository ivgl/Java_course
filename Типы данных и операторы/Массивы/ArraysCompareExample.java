import java.util.Arrays;

public class ArraysCompareExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int result = Arrays.compare(array1, array2);
        System.out.println("Comparison result: " + result); // Вывод: Comparison result: 0
    }
}