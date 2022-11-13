import javax.lang.model.type.IntersectionType;
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
      
        double interestRate = Double.parseDouble(JOptionPane.showInputDialog("Give '%'- per year of interest (as Double number)"));
        double interestRise = Double.parseDouble(JOptionPane.showInputDialog("what is interest rise every year ('%' as Double number)"));
        int valueRegularly = Integer.parseInt(JOptionPane.showInputDialog("Give value you transfer every month"));
        double priceOfOneBound = Double.parseDouble(JOptionPane.showInputDialog("Give price for 1 bound"));
        int taxValue = Integer.parseInt(JOptionPane.showInputDialog("What is capital tax?\nIn Poland tax is 19%"));
        String expireTime = JOptionPane.showInputDialog("What is expire time for 1 Bound? (in months)\nif in years write y before/after value \nlike 1y - 1 year");

interestRate = 7;
interestRise = 1;
valueRegularly = 1000;
taxValue = 19;
expireTime = "4y";
priceOfOneBound = 100;

        ConvertYearsToMonths convertExpireTime = new ConvertYearsToMonths(expireTime);
        int timeToExpire = convertExpireTime.ReturnConvertedValue();


        String interestDuration = JOptionPane.showInputDialog("For how long you plan to invest? (in months)\nif in years write y before/after value \nlike 2y - 2 years"); 

interestDuration = "24y";        

        ConvertYearsToMonths convert = new ConvertYearsToMonths(interestDuration);
        int Duration =  convert.ReturnConvertedValue();

        Bank bank = new Bank(valueRegularly,interestRate,Duration,taxValue,interestRise, timeToExpire,priceOfOneBound);



        for (int i=1;i<Duration+1;i++){
            bank.CountMonths(i);
        }
        double youHave = bank.getMoney();
        
        JOptionPane.showMessageDialog(null, "You paid:"+ youHave);
    }
}
