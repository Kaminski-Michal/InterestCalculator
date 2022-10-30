import javax.swing.JOptionPane;
import java.util.Arrays;
public class Bank {
    
    private double interest = 0;
    private double interestRise = 0;
    private double expireTime = 0;
    private int tax = 0;
    private int duration = 0;
    private int steadyMoneyInpuy = 0;
    protected float[][] arrayOfBonds = new float[3][3];

    Bank(int steadyMoneyInpuy, double intrest, int duration,int tax, double interestRise, int expireTime){      
        this.interest = intrest;
        this.tax = tax;
        this.duration = duration;
        this.steadyMoneyInpuy = steadyMoneyInpuy;
        this.interestRise = interestRise;
        this.expireTime = expireTime;
        
        JOptionPane.showMessageDialog(null,
        "You gonna pay: " +this.steadyMoneyInpuy+"zl every month\n"
        +"for "+this.interest+"%+"+this.interestRise+"% every year\n"
        +"with expire after:" +this.expireTime + "months\n"
        +"for next "+this.duration+" months\n"
        +"Tax is: "+this.tax+"% from capital");
        JOptionPane.showMessageDialog(null, arrayOfBonds[3][3]);
    }

    public float CountMonths() {

        for(int i=0; i>duration; i++){




        }
        
        return 0;
    }

}
