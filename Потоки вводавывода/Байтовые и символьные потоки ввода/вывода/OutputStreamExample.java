import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        String data = "Hello, World!";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            for (int i = 0; i < data.length(); i++) {
                fos.write(data.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}