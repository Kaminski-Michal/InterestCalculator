
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Bank {
    
    private double interest = 0;
    private double interestRise = 0;
    private int expireTime = 0;
    private int tax = 0;
    private int duration = 0;
    private int steadyMoneyInput = 0;
    protected double budgetForThisMonth = 0.0;
    ExpiredBondsReturn ConvertExpiredBonds = new ExpiredBondsReturn();
    AddInterest addInterest = new AddInterest();
    
    protected float[][] arrayOfBonds = new float[112][3];

    Bank(int steadyMoneyInput, double interest, int duration,int tax, double interestRise, int expireTime){      
        this.interest = interest;
        this.tax = tax;
        this.duration = duration;
        this.steadyMoneyInput = steadyMoneyInput;
        this.interestRise = interestRise;
        this.expireTime = expireTime;
        
        JOptionPane.showMessageDialog(null,
        "You gonna pay: " +this.steadyMoneyInput+"zl every month\n"
        +"for "+this.interest+"%+"+this.interestRise+"% every year\n"
        +"with expire after:" +this.expireTime + " months\n"
        +"for next "+this.duration+" months\n"
        +"Tax is: "+this.tax+"% from interest");
    }

    public void CountMonths(int currentMonth) {
        this.budgetForThisMonth = this.budgetForThisMonth + steadyMoneyInput;
        
        addInterest.CalculateInterest(this.arrayOfBonds,currentMonth,this.expireTime,this.tax);
        
        ConvertExpiredBonds.ConvertExpiredBonds(this.arrayOfBonds , currentMonth,this.expireTime);
        




    }
    public double getMoney(){

        return budgetForThisMonth;
    }

}
