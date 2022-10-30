import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
      
        int intrestRate = Integer.parseInt(JOptionPane.showInputDialog("Give '%'- per year of intrest (as Intiger number)"));
       
        int valueRegularly = Integer.parseInt(JOptionPane.showInputDialog("Give value you transfer every month"));

        int taxValue = Integer.parseInt(JOptionPane.showInputDialog("What is income tax?\nIn Poland intrest tax is 19%"));
    
        String intrestDuration = JOptionPane.showInputDialog("For how long you deposit? (in months)\nif in years write y before value \nlike y2 - 2 years"); 
        

        ConvertYearsToMonths convert = new ConvertYearsToMonths(intrestDuration);
        int Duration =  convert.ReturnConvertedValue();

        JOptionPane.showMessageDialog(null, "You gonna pay: " +valueRegularly+"zl every month\nfor "+intrestRate+"%\nfor next "+Duration+" months\n"+"Tax is: "+taxValue+"% from income");

    }
}
