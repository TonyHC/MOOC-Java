
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Literacy> literacy = readFile("literacy.csv");
        
        literacy.stream()
                .sorted((p1, p2) -> Double.compare(p1.getLiteracyPercent(), p2.getLiteracyPercent()))
                .forEach(info -> System.out.println(info));
        
        /*
        literacy.stream().sorted((t1, t2) -> {
            if (t1.getLiteracyPercent() > t2.getLiteracyPercent()) {
                return 1;
            }
            if (t1.getLiteracyPercent() < t2.getLiteracyPercent()) {
                return -1;
            }
        
            return 0;
        }).forEach(t -> System.out.println(t));
        */
    }
    
    public static List<Literacy> readFile(String file) {
        List<Literacy> literacy = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
                 .map(parts -> parts.split(","))
                 .map(parts -> new Literacy(parts[0], parts[1].trim(), parts[2].replace("(%)", "").trim(), parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                 .forEach(parts -> literacy.add(parts));
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return literacy;
    }
}
