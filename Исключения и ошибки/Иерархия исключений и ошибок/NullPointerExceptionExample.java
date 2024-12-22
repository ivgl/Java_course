public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length(); // Вызов метода на null объекте
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}

/*
ArithmeticException: Возникает при попытке деления на ноль.
ArrayIndexOutOfBoundsException: Возникает при попытке доступа к элементу массива за пределами его границ.
IllegalArgumentException: Возникает при передаче недопустимого аргумента в метод.
ClassCastException: Возникает при неправильном приведении типа объекта.
NullPointerException: Возникает при попытке вызова метода или доступа к полю на объекте, который равен null.*/