import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileExample {
    public static void main(String[] args) {
        // Укажите путь к вашему текстовому файлу
        String filePath = "example.txt";

        try (Scanner scanner = new Scanner(new File(filePath))) {
            // Чтение данных из файла
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }
    }
}	