import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
      
        int intrestRate = Integer.parseInt(JOptionPane.showInputDialog("Give '%'- per year of intrest (as Intiger number)"));

        int interestRise = Integer.parseInt(JOptionPane.showInputDialog("what is interest rise every year ('%' as Intiger number)"));
       
        int valueRegularly = Integer.parseInt(JOptionPane.showInputDialog("Give value you transfer every month"));

        int taxValue = Integer.parseInt(JOptionPane.showInputDialog("What is capital tax?\nIn Poland tax is 19%"));
    
        String intrestDuration = JOptionPane.showInputDialog("For how long you deposit? (in months)\nif in years write y before/after value \nlike 2y - 2 years"); 
        

        ConvertYearsToMonths convert = new ConvertYearsToMonths(intrestDuration);
        int Duration =  convert.ReturnConvertedValue();

       
        

        Bank transferValues = new Bank(valueRegularly,intrestRate,Duration,taxValue,interestRise);
        
    }
}
