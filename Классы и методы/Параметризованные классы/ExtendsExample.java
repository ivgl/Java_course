import java.util.ArrayList;
import java.util.List;

public class ExtendsExample {
    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();

        // Метод принимает List<? extends Number>
        printList(numberList);
        printList(integerList);
        printList(doubleList);
    }

    public static void printList(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }
}

/*Конструкция <? extends T> используется для ограничения типов, которые могут быть использованы в параметризованном классе или методе. Она означает, что тип должен быть подклассом или самим классом T.*/