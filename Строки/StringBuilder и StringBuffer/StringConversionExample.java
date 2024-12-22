public class StringConversionExample {
    public static void main(String[] args) {
        // Преобразование String в StringBuffer
        String str = "Hello";
        StringBuffer sb = new StringBuffer(str);
        System.out.println("String to StringBuffer: " + sb); // Hello

        // Преобразование String в StringBuilder
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println("String to StringBuilder: " + sb2); // Hello

        // Преобразование StringBuffer в String
        String strFromSb = sb.toString();
        System.out.println("StringBuffer to String: " + strFromSb); // Hello

        // Преобразование StringBuilder в String
        String strFromSb2 = sb2.toString();
        System.out.println("StringBuilder to String: " + strFromSb2); // Hello

        // Преобразование StringBuffer в StringBuilder
        StringBuilder sbFromSb = new StringBuilder(sb);
        System.out.println("StringBuffer to StringBuilder: " + sbFromSb); // Hello

        // Преобразование StringBuilder в StringBuffer
        StringBuffer sbFromSb2 = new StringBuffer(sb2);
        System.out.println("StringBuilder to StringBuffer: " + sbFromSb2); // Hello
    }
}