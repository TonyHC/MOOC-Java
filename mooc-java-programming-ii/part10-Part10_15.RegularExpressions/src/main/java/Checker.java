

public class Checker {
    public Checker() {
        
    } 
    
    public boolean isDayOfWeek(String string) {
        if(string.matches("mon|wed|fri|t(ue|hu)|s(at|un)"))
            return true;
        
        return false;
    }
    
    public boolean allVowels(String string) {
        if(string.matches("[a|e|i|o|u]+"))
            return true;
        
        return false;
    }
    
    public boolean timeOfDay(String string) {
        if(string.matches("([0-1][0-9]|[2][0-3]):[0-5][0-9]:[0-5][0-9]"))
            return true;
        
        return false;
    }
}
