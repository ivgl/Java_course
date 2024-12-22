public class SwitchFallThroughExample {
    public static void main(String[] args) {
        int value = 2;
        int i = 0;

        switch (value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
            case 3:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }

        System.out.println("i: " + i);
    }
}

/*Если value равно 2, то выполнение начнется с case 2.
Поскольку в case 2 отсутствует break, выполнение продолжится в case 3.
В case 3 значение i будет установлено в 3, и затем выполнение завершится, так как там есть break.
Таким образом, если value равно 2, то i будет равно 3. Это явление называется "fall-through" (проход через кейсы).*/