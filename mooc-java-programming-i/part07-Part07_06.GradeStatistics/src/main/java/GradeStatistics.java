
import java.util.ArrayList;


public class GradeStatistics {
    ArrayList<Integer> pointList;
    ArrayList<Integer> gradeList;
    
    public GradeStatistics() {
        this.pointList = new ArrayList<>();
        this.gradeList = new ArrayList<>();
    }
    
    public void add(int point) {
        if(point >= 0 && point <= 100) {
            this.pointList.add(point);
        
            int grade = pointsToGrades(point);
            this.gradeList.add(grade);
        }
    }
    
    public int pointsToGrades(int point) {
        int grade = 0;
        if(point >= 90) {
            grade = 5;
        } else if(point >= 80) {
            grade = 4;
        } else if(point >= 70) {
            grade = 3;
        } else if(point >= 60) {
            grade = 2;
        } else if(point >= 50) {
            grade = 1;
        } else {
            grade = 0;
        }
        
        return grade;
    }
    
    public double pointAverage() {
        double sum = 0;
        for(int point : pointList) {
            sum += point;
        }
        
        return sum / pointList.size();
    }
    
    public double passingGradesPointAverage() {
        int sum = 0;
        int count = 0;
        for(int point : pointList) {
            if(point >= 50 && point <= 100) {
                sum += point;
                count++;
            }
        }
        
        return (double) sum / count;
    }
    
    public double passingPercentage() {
        int passingCount = 0;
        for(int point : pointList) {
            if(point >= 50) {
                passingCount++;
            }
        }
        
        return 100 * (double) passingCount / pointList.size();
    }
}
