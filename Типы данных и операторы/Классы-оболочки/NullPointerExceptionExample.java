public class NullPointerExceptionExample {
    public static void main(String[] args) {
        Integer i = null;
        int j = i; // NullPointerException будет брошено здесь
    }
}

/*При попытке автораспаковки unboxing значения null в базовый тип будет брошено исключение NullPointerException.*/