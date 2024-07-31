
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
    
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros() + addition.euros(), this.cents() + addition.cents());
        
        return newMoney;
    }
    
    public Money minus(Money decreaser){
        int euro = this.euros; //10
        int cent = this.cents; //00
        
        cent = cent - decreaser.cents(); // 0 = 0 - 50
        
        if(cent < 0){ // true
            cent = 100 + cent; // -50 = 100 - 50
            euro--;   // 10 = 10 - 1         
        }
        
        euro = euro - decreaser.euros(); // 9 = 9 - 3
        
        if(euro < 0){
            euro = 0;
            cent = 0;
        }
        
        Money newMoney = new Money(euro, cent);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(euros < compared.euros){
            return true;
        }
        if(euros == compared.euros){
            return cents < compared.cents();
        }
        return false;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    

}
