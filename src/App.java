import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
      
        String intrestRate = JOptionPane.showInputDialog("Give '%' of intrest (as Intiger number)");
       
        int valueRegularly = Integer.parseInt(JOptionPane.showInputDialog("Give value you transfer every month"));
    
        String intrestDuration = JOptionPane.showInputDialog("For how long you deposit? (in months)\nif in years write y before value \nlike y2 - 2 years"); 
        
        ConvertYearsToMonths convert = new ConvertYearsToMonths(intrestDuration);
        int Duration =  convert.ReturnConvertedValue();

        JOptionPane.showMessageDialog(null, "You gonna pay: " +valueRegularly+" every month\nfor "+intrestRate+"%\nfor next "+Duration+" months");

        
    }
}
