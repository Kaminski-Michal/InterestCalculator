import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

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
    BuyNewBounds BuyNew;
    
    Bank(int steadyMoneyInput, double interest, int duration,int tax, double interestRise, int expireTime, double priceOfOneBound){      
        this.interest = interest;
        this.tax = tax;
        this.duration = duration;
        this.steadyMoneyInput = steadyMoneyInput;
        this.interestRise = interestRise;
        this.expireTime = expireTime;
        this.priceOfOneBound = priceOfOneBound;
        BuyNew = new BuyNewBounds( this.expireTime, this.priceOfOneBound, interest);

        JOptionPane.showMessageDialog(null,
        "You gonna pay: " +this.steadyMoneyInput+"zl every month\n"
        +"for "+this.interest+"%+"+this.interestRise+"% every year\n"
        +"with expire after:" +this.expireTime + " months\n"
        +"for next "+this.duration+" months\n"
        +"price for 1 bound is:"+this.priceOfOneBound+"zl\n"
        +"Tax is: "+this.tax+"% from interest");
    }


    private ConcurrentHashMap <Integer, float[]> ListOfBonds = new ConcurrentHashMap<>();

    public void CountMonths(int currentMonth) {

        this.budgetForThisMonth = this.budgetForThisMonth + steadyMoneyInput;        
        this.budgetForThisMonth += addInterest.CalculateInterest(ListOfBonds,currentMonth,this.tax,interestRise);
        this.budgetForThisMonth +=ConvertExpiredBonds.ConvertExpiredBonds(ListOfBonds , currentMonth);
        BuyNew.buyNew(ListOfBonds, currentMonth,this.budgetForThisMonth);
        budgetForThisMonth = BuyNew.changeAfterBuyingBonds();
    }
    public double getMoney(){

        return (this.budgetForThisMonth);
    }
    public double moneyStackedInBonds(){
        Set<Integer>positionInHashMap = ListOfBonds.keySet();
        double moneyHeldInBonds=0;

        for (Integer keyForMonthBond : positionInHashMap){

            float[]specificBond=ListOfBonds.get(keyForMonthBond);
            moneyHeldInBonds +=specificBond[0];
        }
        
        return moneyHeldInBonds;
    }

}
