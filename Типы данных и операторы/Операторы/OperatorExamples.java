public class OperatorExamples {
    public static void main(String[] args) {
        // Примеры с базовыми типами
        int a = 10;
        int b = 5;
        int c = 0;

        // Операторы присваивания
        c += a; // c = c + a
        System.out.println("c += a: " + c);
        c -= b; // c = c - b
        System.out.println("c -= b: " + c);
        c *= a; // c = c * a
        System.out.println("c *= a: " + c);
        c /= b; // c = c / b
        System.out.println("c /= b: " + c);
        c %= a; // c = c % a
        System.out.println("c %= a: " + c);

        // Тернарный оператор
        int max = (a > b) ? a : b;
        System.out.println("max: " + max);

        // Логические операторы
        boolean result = (a > b) || (b > c);
        System.out.println("result: " + result);
        result = (a > b) && (b > c);
        System.out.println("result: " + result);

        // Побитовые операторы
        int bitwiseOr = a | b;
        System.out.println("bitwiseOr: " + bitwiseOr);
        int bitwiseXor = a ^ b;
        System.out.println("bitwiseXor: " + bitwiseXor);
        int bitwiseAnd = a & b;
        System.out.println("bitwiseAnd: " + bitwiseAnd);

        // Операторы сравнения
        boolean isEqual = (a == b);
        System.out.println("isEqual: " + isEqual);
        boolean isGreater = (a > b);
        System.out.println("isGreater: " + isGreater);
        boolean isLessOrEqual = (a <= b);
        System.out.println("isLessOrEqual: " + isLessOrEqual);

        // Сдвиговые операторы
        int rightShift = a >> 1;
        System.out.println("rightShift: " + rightShift);
        int unsignedRightShift = a >>> 1;
        System.out.println("unsignedRightShift: " + unsignedRightShift);
        int leftShift = a << 1;
        System.out.println("leftShift: " + leftShift);

        // Арифметические операторы
        int sum = a + b;
        System.out.println("sum: " + sum);
        int difference = a - b;
        System.out.println("difference: " + difference);
        int product = a * b;
        System.out.println("product: " + product);
        int quotient = a / b;
        System.out.println("quotient: " + quotient);
        int remainder = a % b;
        System.out.println("remainder: " + remainder);

        // Инкремент и декремент
        int preIncrement = ++a;
        System.out.println("preIncrement: " + preIncrement);
        int postIncrement = a++;
        System.out.println("postIncrement: " + postIncrement);
        int preDecrement = --a;
        System.out.println("preDecrement: " + preDecrement);
        int postDecrement = a--;
        System.out.println("postDecrement: " + postDecrement);

        // Унарные операторы
        int negation = ~a;
        System.out.println("negation: " + negation);
        boolean not = !isEqual;
        System.out.println("not: " + not);

        // Примеры с типом String
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println("str3: " + str3);

        // Операторы сравнения для строк
        boolean isStringEqual = (str1 == str2);
        System.out.println("isStringEqual: " + isStringEqual);
        boolean isStringNotEqual = (str1 != str2);
        System.out.println("isStringNotEqual: " + isStringNotEqual);

        // Конкатенация строк
        str1 += " Java";
        System.out.println("str1: " + str1);
    }
}