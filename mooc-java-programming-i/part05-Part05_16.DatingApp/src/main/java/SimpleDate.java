
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day = this.day + 1;
        int remainingDays = this.day;
        
        if(this.day > 30) {
            remainingDays -= 30;
            this.day = 0;
            this.month = this.month + 1;
            
            if(this.month > 12) {
                this.month = 1;
                this.year = this.year + 1;
            }
        }
        
        this.day = remainingDays;
    }
    
    public void advance(int howManyDays) {
        this.day = this.day + howManyDays - 1;
        advance();
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        
        newDate.day = newDate.day + days;
        int remainingDays = newDate.day; 
        
        while(remainingDays > 30) {
            if(newDate.day > 30 || remainingDays > 30) {
                remainingDays -= 30;
                newDate.day = 0;
                newDate.month = newDate.month + 1;

                if(newDate.month > 12) {
                    newDate.month = 1;
                    newDate.year = newDate.year + 1;
                }
            }
        }
        
        newDate.day = remainingDays;
        
        return newDate;
    }
}
