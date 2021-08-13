
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = "";
        try {
            s = new String(Files.readAllBytes(Paths.get("num.txt")));
        } catch (Exception exception) {

        }
        System.out.println(s);

        String[] lines = s.split("[.!?]");
        String[] words = s.split(" ");
        double c = 0;
        for (int i = 0; i < words.length; i++) {
            c += words[i].length();
        }

        double score = 4.71 * (c / words.length) + 0.5 * ((double)words.length / lines.length) - 21.43;

        System.out.println(c);
        System.out.println(words.length);
        System.out.println(lines.length);
        System.out.printf("%f", score);
    }
}
