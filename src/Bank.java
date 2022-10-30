import java.time.Duration;

import javax.swing.JOptionPane;
public class Bank {
    
    private int interest = 0;
    private int interestRise = 0;
    private int tax = 0;
    private int duration = 0;
    private int steadyMoneyInpuy = 0;

    Bank(int steadyMoneyInpuy,int intrest,int duration,int tax,int interestRise){      
        this.interest = intrest;
        this.tax = tax;
        this.duration = duration;
        this.steadyMoneyInpuy = steadyMoneyInpuy;
        this.interestRise = interestRise;
        
        JOptionPane.showMessageDialog(null, "You gonna pay: " +this.steadyMoneyInpuy+"zl every month\nfor "+this.interest+"%+"+this.interestRise+"% every year\nfor next "+this.duration+" months\n"+"Tax is: "+this.tax+"% from capital");
    }



}
