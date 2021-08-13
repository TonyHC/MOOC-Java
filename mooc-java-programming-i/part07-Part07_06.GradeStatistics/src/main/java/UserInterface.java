
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private GradeStatistics gradeStat;
    
    public UserInterface(Scanner scanner, GradeStatistics gradeStat) {
        this.scanner = scanner;
        this.gradeStat = gradeStat;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int point = Integer.valueOf(scanner.nextLine());
            if(point == -1) {
                break;
            }
            
            this.gradeStat.add(point);
        }
        
        System.out.println("Point average (all): " + gradeStat.pointAverage());
        
        double passingGradePointsAvg = gradeStat.passingGradesPointAverage();
        if(passingGradePointsAvg >= 50.0) 
            System.out.println("Points average (passing): " + passingGradePointsAvg);
        else
            System.out.println("Points average (passing): -");
        
        System.out.println("Passing percentage: " + gradeStat.passingPercentage());
        
        System.out.println("Grading distribution:");
        numberOfGrades();
    }
    
    public void numberOfGrades() {
        int currentGrade = 5;
        while(currentGrade >= 0) {
            System.out.print(currentGrade + ": ");
            printStars(currentGrade);
            currentGrade--;
        }
    }
    
    public void printStars(int currentGrade) {
        for(int grade : this.gradeStat.gradeList) {
            if(currentGrade == grade)
                System.out.print("*");
        }
        
        System.out.println("");
    }
}
