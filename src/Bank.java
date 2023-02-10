
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;
public class Bank {
    
    private double interest = 0;
    private double interestRise = 0;
    private double priceOfOneBound = 0;
    private int expireTime = 0;
    private int tax = 0;
    private int duration = 0;
    private int steadyMoneyInput = 0;
    protected double budgetForThisMonth = 0.0;
    ExpiredBondsReturn ConvertExpiredBonds = new ExpiredBondsReturn();
    AddInterest addInterest = new AddInterest();
    
    
    Bank(int steadyMoneyInput, double interest, int duration,int tax, double interestRise, int expireTime, double priceOfOneBound){      
        this.interest = interest;
        this.tax = tax;
        this.duration = duration;
        this.steadyMoneyInput = steadyMoneyInput;
        this.interestRise = interestRise;
        this.expireTime = expireTime;
        this.priceOfOneBound = priceOfOneBound;
        
        JOptionPane.showMessageDialog(null,
        "You gonna pay: " +this.steadyMoneyInput+"zl every month\n"
        +"for "+this.interest+"%+"+this.interestRise+"% every year\n"
        +"with expire after:" +this.expireTime + " months\n"
        +"for next "+this.duration+" months\n"
        +"price for 1 bound is:"+this.priceOfOneBound+"zl\n"
        +"Tax is: "+this.tax+"% from interest");
    }


    private HashMap <Integer, float[]> ListOfBonds = new HashMap<>();

    public void CountMonths(int currentMonth) {

        this.budgetForThisMonth = this.budgetForThisMonth + steadyMoneyInput;        

        addInterest.CalculateInterest(ListOfBonds,currentMonth,this.tax);
        ConvertExpiredBonds.ConvertExpiredBonds(ListOfBonds , currentMonth);
        BuyNewBounds BuyNew = new BuyNewBounds(ListOfBonds, currentMonth, this.budgetForThisMonth, this.expireTime, this.priceOfOneBound);
        budgetForThisMonth = BuyNew.changeAfterBuyingBonds();

    }
    public double getMoney(){

        return (this.budgetForThisMonth);
    }

}
