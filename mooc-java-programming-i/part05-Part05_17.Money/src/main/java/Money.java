
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;
        
        Money newMoney = new Money(totalEuros, totalCents);

        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        boolean result;
        if(this.euros < compared.euros) {
            return true;
        }
        
        if((this.euros <= compared.euros) && (this.cents < compared.cents)) {
            return true;
        }
        
        return false;
    }
    
    public Money minus(Money decreaser) {
        int currentEuros = this.euros - decreaser.euros;
        int currentCents = this.cents - decreaser.cents;
        
        if(currentEuros < 0) {
            return new Money(0, 0);
        }
        
        if(currentCents < 0) {
            currentEuros -= 1;
            currentCents = 100 - (currentCents * -1);
        }
        
        return new Money(currentEuros, currentCents);
    }
}
