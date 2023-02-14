import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        double interestRate = 7.0;
        double interestRise = 1.0;
        int valueRegularly = 1000;
        double priceOfOneBound = 100;
        int taxValue = 19;
        String expireTime = "4y";
        String interestDuration ="6y";
        double spend=0;

        /*
         interestRate = Double.parseDouble(JOptionPane.showInputDialog("Give '%'- per year of interest (as Double number)"));
         interestRise = Double.parseDouble(JOptionPane.showInputDialog("what is interest rise every year ('%' as Double number)"));
         valueRegularly = Integer.parseInt(JOptionPane.showInputDialog("Give value you transfer every month"));
         priceOfOneBound = Double.parseDouble(JOptionPane.showInputDialog("Give price for 1 bound"));
         taxValue = Integer.parseInt(JOptionPane.showInputDialog("What is capital tax?\nIn Poland tax is 19%"));
         expireTime = JOptionPane.showInputDialog("What is expire time for 1 Bound? (in months)\nif in years write y before/after value \nlike 1y - 1 year");
         */

        ConvertYearsToMonths convertExpireTime = new ConvertYearsToMonths(expireTime);
        int timeToExpire = convertExpireTime.ReturnConvertedValue();

       // interestDuration = JOptionPane.showInputDialog("For how long you plan to invest? (in months)\nif in years write y before/after value \nlike 2y - 2 years"); 

        ConvertYearsToMonths convert = new ConvertYearsToMonths(interestDuration);
        int Duration =  convert.ReturnConvertedValue();

        Bank bank = new Bank(valueRegularly,interestRate,Duration,taxValue,interestRise, timeToExpire,priceOfOneBound);

        for (int i=1;i<Duration+1;i++){
            spend +=valueRegularly;
            bank.CountMonths(i);

        }
        double afterAllRestIs = bank.getMoney();
        double stackedInBonds = bank.moneyStackedInBonds();
        double earnAfterInvestment= (stackedInBonds + afterAllRestIs);
        JOptionPane.showMessageDialog(null, String.format("after all months you have: %.2f of change\n"+
        "You spend: %,.2f of your money\n"+
        "in bonds you have %,.2f\n"+
        "that mean you got extra: %,.2f after investment",afterAllRestIs, spend, stackedInBonds,earnAfterInvestment));
    }
}