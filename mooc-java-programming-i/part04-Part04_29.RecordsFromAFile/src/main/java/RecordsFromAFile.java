
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(fileName))) {
            while(scan.hasNextLine()) {
                String fileInfo = scan.nextLine();
                String[] fileContent = fileInfo.split(",");
                
                String name = fileContent[0];
                int age = Integer.valueOf(fileContent[1]);
                
                System.out.println(name + ", age: " + age + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
