import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
      
        double intrestRate = Double.parseDouble(JOptionPane.showInputDialog("Give '%'- per year of intrest (as Double number)"));
        double interestRise = Double.parseDouble(JOptionPane.showInputDialog("what is interest rise every year ('%' as Double number)"));
        int valueRegularly = Integer.parseInt(JOptionPane.showInputDialog("Give value you transfer every month"));
        int taxValue = Integer.parseInt(JOptionPane.showInputDialog("What is capital tax?\nIn Poland tax is 19%"));
        String expireTime = JOptionPane.showInputDialog("What is expire time for 1 Bound? (in months)\nif in years write y before/after value \nlike 1y - 1 year");

        ConvertYearsToMonths convertExpireTime = new ConvertYearsToMonths(expireTime);
        int timeToExpire = convertExpireTime.ReturnConvertedValue();


        String intrestDuration = JOptionPane.showInputDialog("For how long you plan to invest? (in months)\nif in years write y before/after value \nlike 2y - 2 years"); 
        
        ConvertYearsToMonths convert = new ConvertYearsToMonths(intrestDuration);
        int Duration =  convert.ReturnConvertedValue();

        Bank bank = new Bank(valueRegularly,intrestRate,Duration,taxValue,interestRise, timeToExpire);

    }
}
