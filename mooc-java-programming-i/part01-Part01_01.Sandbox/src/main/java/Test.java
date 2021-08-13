
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
        double[] ar = {1, 4, 2};
        int[] ab = {1, 2, 3, 4, 1};
        int[] ax = new int[17];
        String[] s = {"mARIANN", "jOI", "gEORGEANN"};
        String a = "(123) 456-7890";
        String b = "Last Minute Deal][$1039] Machu Picchu 3 Day Trip [Machu Picchu]";

        System.out.println(Arrays.toString(factorize(12)));

        System.out.println(sum(ab));
        System.out.println(formatNum(2000));
        System.out.println(timeForMilkAndCookies(new GregorianCalendar(2020, 11, 24)));
        System.out.println(boxSeq(99));

        //String replace = a.replaceAll("[^a-zA-Z]", "");
        //System.out.println(replace);
        System.out.println(retrieveMajor("3.12.5"));

    }

    private enum Rps {
        PAPER, SCISSORS, ROCK
    }

    public static String rps(String s1, String s2) {
        int p1 = Rps.valueOf(s1.toUpperCase()).ordinal();
        int p2 = Rps.valueOf(s2.toUpperCase()).ordinal();
        
        return (p1 == p2) ? "TIE"
                : (p1 - p2 == 1 || p1 - p2 == 1 - Rps.values().length) ? "Player 1 wins"
                : "Player 2 wins";
    }

    public static int[] factorize(int num) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }

        return listToArray(factors);
    }

    public static int[] listToArray(List<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    /*
        Checks for a valid phone number using Regular Expressions
        in  the following format:
        (xxx) xxx-xxxx
     */
    public static boolean isValidPhoneNumber(String s) {
        return s.matches("\\([0-9]+\\)\\s[0-9]+\\-[0-9]+");
    }

    public static String correctSpacing(String sentence) {
        /*
            Better way to remove excess whitespace and have only one
            whitespace separating each word
        
            return sentence.replaceAll("[ ]+", " ").trim();
         */
        StringBuilder sb = new StringBuilder();
        String[] parts = sentence.trim().split(" ");

        for (int i = 0; i < parts.length - 1; i++) {
            if (!parts[i].isEmpty()) {
                sb.append(parts[i]).append(" ");
            }
        }

        sb.append(parts[parts.length - 1]);

        return sb.toString();
    }

    public static String maskify(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.length() < 4) {
            return s;
        }

        String maskifyStr = s.substring(0, s.length() - 4).replaceAll(".", "#");
        return maskifyStr + s.substring(s.length() - 4, s.length());
    }

    public static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        if (arr.length == 1) {
            return arr[0];
        }

        int[] updatedArr = Arrays.copyOfRange(arr, 1, arr.length);

        return arr[0] + sum(updatedArr);
    }

    public static double myPi(int num) {
        String formatNumOfDecimals = "%." + String.valueOf(num) + "f";
        String nPi = String.format(formatNumOfDecimals, Math.PI);

        return Double.valueOf(nPi);
    }

    /*
        Recursively function to count the number of vowels in a String
     */
    public static int countVowels(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i'
                || str.charAt(0) == 'o' || str.charAt(0) == 'u') {
            return 1 + countVowels(str.substring(1));
        }

        return countVowels(str.substring(1));
    }

    public static String[] getValues(Map<String, String> dict) {
        List<String> values = new ArrayList<>();
        for (String val : dict.values()) {
            values.add(val);
        }

        return values.toArray(new String[values.size()]);
    }

    public static int boxSeq(int step) {
        if (step == 0) {
            return 0;
        }

        if (step % 2 != 0) {
            return 3 + boxSeq(step - 1);
        } else {
            return -1 + boxSeq(step - 1);
        }
    }

    public static boolean timeForMilkAndCookies(GregorianCalendar date) {
        // Thu Dec 24 00:00:00 EST 2020
        // System.out.println(date.getTime());
        // 11/24/2020
        // System.out.print(date.get(Calendar.MONTH) + "/");
        // System.out.print(date.get(Calendar.DATE) + "/");
        // System.out.print(date.get(Calendar.YEAR) + "\n");

        /*
            Without using the Calendar Class -> GregorianCalendar Class implements Calendar
            if (date.get(GregorianCalendar.MONTH) == 11 && date.get(GregorianCalendar.DATE) == 24)
         */
        if (date.get(Calendar.MONTH) == 11 && date.get(Calendar.DATE) == 24) {
            return true;
        }

        return false;
    }

    public static String formatNum(int num) {
        /*
            Formats your integer decimal
            return String.format("%,d", num);
         */
        String number = String.valueOf(num);

        if (number.length() < 4) {
            return number;
        }

        StringBuilder sb = new StringBuilder();

        int counter = 0;
        while (num != 0) {
            int digit = num % 10;
            sb.append(digit);

            num /= 10;
            counter++;

            if (counter % 3 == 0 && number.length() > counter) {
                sb.append(",");
            }
        }

        return sb.reverse().toString();
    }

    // Recursively finding the gdc between two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static String retrieveMajor(String semver) {
        String[] replaceStr = semver.split("\\.");
        return replaceStr[0];
    }

    public static String stripSentence(String str, String chars) {
        /*
            // SImple solution
            String regex = "[" + chars  +"]";
            return str.replaceAll(regex, "");
         */

        // Check if each character in chars is in str
        for (char c : chars.toCharArray()) {
            if (!str.contains(String.valueOf(c))) {
                return str;
            }
        }

        // If chars contains a space, then create a new string without spaces
        String regex = "";
        if (chars.contains(" ")) {
            String[] parts = chars.split(" ");
            for (String s : parts) {
                regex += s;
            }
        } else {
            regex = chars;
        }

        // Build the custom regex string (Regular Expression)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < regex.length(); i++) {
            if (i == regex.length() - 1) {
                sb.append(regex.charAt(i));
            } else {
                sb.append(regex.charAt(i)).append("|");
            }
        }

        String replaceStr = str.replaceAll(sb.toString(), "").trim();
        if (replaceStr.isEmpty()) {
            return "";
        }

        return replaceStr;
    }

    public static int countTrue(boolean[] arr) {
        long result = IntStream.range(0, arr.length).filter(i -> arr[i] == true).count();
        System.out.println(result);
        return (int) (result);
    }

    public static String getMiddle(String word) {
        if (word.isEmpty()) {
            return "";
        }

        if (word.length() <= 2) {
            return word;
        }

        StringBuilder sb = new StringBuilder();
        if (word.length() % 2 == 0) {
            return sb.append(word.charAt(word.length() / 2 - 1))
                    .append(word.charAt(word.length() / 2)).toString();
        }

        return sb.append(word.charAt(word.length() / 2)).toString();
    }

    public static boolean powerOfTwo(int num) {
        while (num > 1 && num % 2 == 0) {
            num = num / 2;
        }
        return num == 1;
    }

    public static double[] minMax(double[] arr) {
        double[] sortedArr = new double[2];

        double temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        sortedArr[0] = arr[0];
        sortedArr[1] = arr[arr.length - 1];

        return sortedArr;
    }

    public static boolean isSymmetrical(int num) {
        int orgNum = num;
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return orgNum == reversed;
    }

    public static String unstretch(String word) {
        /*
            // TIme Complexity: O(n)
            StringBuilder sb = new StringBuilder();
            // word.chars() converts the characters in the string to the ASCII Values and
            // removes all duplicate characters in the string
            word.chars().distinct().forEach(c -> sb.append((char) c));
            
            return sb.toString();
         */

 /*
                Removes consecutve characters in a string
                Time Complexity: O(nlogn)
         */
        StringBuilder sb = new StringBuilder();
        if (!word.isEmpty()) {
            char[] charArr = word.toCharArray();
            // Arrays.sort(charArr) -> Sorts the char[] (Optional)
            sb.append(charArr[0]);
            for (int i = 1; i < charArr.length; i++) {
                if (charArr[i] != charArr[i - 1]) {
                    sb.append(charArr[i]);
                }
            }
        }

        return sb.toString();
    }

    public static double[] bSort(double[] arr) {
        double temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static int leftDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return Character.getNumericValue(c);
            }
        }

        return -1;
    }
}
