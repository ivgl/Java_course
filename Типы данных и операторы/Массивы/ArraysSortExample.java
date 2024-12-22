import java.util.Arrays;

public class ArraysSortExample {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 4, 2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // Вывод: [1, 2, 3, 4, 5]
    }
}