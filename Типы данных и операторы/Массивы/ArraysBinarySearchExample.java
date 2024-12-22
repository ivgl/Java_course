import java.util.Arrays;

public class ArraysBinarySearchExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(array, 3);
        System.out.println("Index of 3: " + index); // Вывод: Index of 3: 2
    }
}