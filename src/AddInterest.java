import java.util.HashMap;
import java.util.Set;

public class AddInterest {
    
    private double valueToReturn = 0;
    private double takenInTax = 0;

    private double taxTaken = 0;
    private double earnFromThisBond = 0;
    public double CalculateInterest(HashMap <Integer, float[]> arrayOfBonds,double currentMonth,int tax){
        Set<Integer>positionInHashMap = arrayOfBonds.keySet();


        for (Integer keyForMonthOfBond : positionInHashMap){
            float[] specificMonthBond = arrayOfBonds.get(keyForMonthOfBond);
            if (keyForMonthOfBond % 12 == currentMonth % 12){
                taxTaken=((specificMonthBond[0]*specificMonthBond[1]/100)*tax/100);
                earnFromThisBond=((specificMonthBond[0]*specificMonthBond[1]/100)-taxTaken);
                takenInTax += taxTaken;
                valueToReturn += earnFromThisBond;
            }

            
        }

        return valueToReturn;
    }
    
    double getValueFromTax(){
        
        return takenInTax;
    }
    
}