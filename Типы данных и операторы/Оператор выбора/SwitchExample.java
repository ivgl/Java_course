public class SwitchExample {
    public static void main(String[] args) {
        // Пример с byte
        byte byteValue = 1;
        switch (byteValue) {
            case 1:
                System.out.println("byteValue is 1");
                break;
            case 2:
                System.out.println("byteValue is 2");
                break;
            default:
                System.out.println("byteValue is not 1 or 2");
                break;
        }

        // Пример с short
        short shortValue = 2;
        switch (shortValue) {
            case 1:
                System.out.println("shortValue is 1");
                break;
            case 2:
                System.out.println("shortValue is 2");
                break;
            default:
                System.out.println("shortValue is not 1 or 2");
                break;
        }

        // Пример с char
        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("charValue is A");
                break;
            case 'B':
                System.out.println("charValue is B");
                break;
            default:
                System.out.println("charValue is not A or B");
                break;
        }

        // Пример с int
        int intValue = 3;
        switch (intValue) {
            case 1:
                System.out.println("intValue is 1");
                break;
            case 2:
                System.out.println("intValue is 2");
                break;
            default:
                System.out.println("intValue is not 1 or 2");
                break;
        }

        // Пример с String
        String stringValue = "Hello";
        switch (stringValue) {
            case "Hello":
                System.out.println("stringValue is Hello");
                break;
            case "World":
                System.out.println("stringValue is World");
                break;
            default:
                System.out.println("stringValue is not Hello or World");
                break;
        }

        // Пример с enum
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        Day dayValue = Day.WEDNESDAY;
        switch (dayValue) {
            case MONDAY:
                System.out.println("dayValue is MONDAY");
                break;
            case WEDNESDAY:
                System.out.println("dayValue is WEDNESDAY");
                break;
            default:
                System.out.println("dayValue is not MONDAY or WEDNESDAY");
                break;
        }
    }
}