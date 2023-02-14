import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class AddInterest {
    
    private double valueToReturn = 0;
    private double takenInTax = 0;

    private double taxTaken = 0;
    private double earnFromThisBond = 0;
    public double CalculateInterest(ConcurrentHashMap <Integer, float[]> arrayOfBonds,double currentMonth,int tax,double interestRise){
        Set<Integer>positionInHashMap = arrayOfBonds.keySet();
        this.valueToReturn = 0;

        for (Integer keyForMonthOfBond : positionInHashMap){
            float[] specificMonthBond = arrayOfBonds.get(keyForMonthOfBond);
            if (keyForMonthOfBond % 12 == currentMonth % 12){
                taxTaken=((specificMonthBond[0]*specificMonthBond[1]/100)*tax/100);
                earnFromThisBond=((specificMonthBond[0]*specificMonthBond[1]/100)-taxTaken);
                takenInTax += taxTaken;
                this.valueToReturn += earnFromThisBond;
                specificMonthBond[1]=specificMonthBond[1]+(float)interestRise;
            }
        }

        return this.valueToReturn;
    }
    double getValueFromTax(){
        
        return takenInTax;
    }
}