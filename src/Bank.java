
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

    public float[][] resize(float[][] arrayOfBonds,boolean sizeUp,int rowToIgnore){
        int sizeChange = 0;
        
        if(sizeUp){
            sizeChange = 1;
        }
        else{
            sizeChange = -1;
        }
        
        float[][] NewArray = new float[arrayOfBonds.length + sizeChange][3];

        for(int i = 0;i<arrayOfBonds.length;i++){
        
            if(!sizeUp && i == rowToIgnore){}
            else {
                NewArray[i][0] = arrayOfBonds[i][0];
                NewArray[i][1] = arrayOfBonds[i][1];
                NewArray[i][2] = arrayOfBonds[i][2];
            }
        }

        return arrayOfBonds;
    }
    
    public void CountMonths(int currentMonth) {
        this.budgetForThisMonth = this.budgetForThisMonth + steadyMoneyInput;
        float[][] arrayOfBonds = new float[1000][3];
        
        addInterest.CalculateInterest(arrayOfBonds,currentMonth,this.expireTime,this.tax);
        
        ConvertExpiredBonds.ConvertExpiredBonds(arrayOfBonds , currentMonth,this.expireTime);

        BuyNewBounds BuyNew = new BuyNewBounds(currentMonth, this.budgetForThisMonth, this.expireTime);
        

    }
    public double getMoney(){

        return (this.budgetForThisMonth);
    }

}
