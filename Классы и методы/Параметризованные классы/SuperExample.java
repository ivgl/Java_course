import java.util.ArrayList;
import java.util.List;

public class SuperExample {
    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        // Метод принимает List<? super Number>
        addNumbers(numberList);
        addNumbers(objectList);
    }

    public static void addNumbers(List<? super Number> list) {
        list.add(1);
        list.add(2.0);
    }
}

/*Конструкция <? super T> используется для ограничения типов, которые могут быть использованы в параметризованном классе или методе. Она означает, что тип должен быть суперклассом или самим классом T. */