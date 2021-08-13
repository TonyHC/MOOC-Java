

public class MainProgram {

    public static void main(String[] args) {
        Checker check = new Checker();
        System.out.println(check.isDayOfWeek("mon"));
        System.out.println(check.isDayOfWeek("thu"));
        System.out.println(check.isDayOfWeek("fun"));
        
        System.out.println("----");
        
        System.out.println(check.allVowels("aaaeiuuo"));
        System.out.println(check.allVowels("ouadei"));
        
        System.out.println("----");
        System.out.println(check.timeOfDay("02:43:59"));
        System.out.println(check.timeOfDay("33:33:34"));
        System.out.println(check.timeOfDay("20:00:00"));
    }
}
