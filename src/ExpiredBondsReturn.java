import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;


public class ExpiredBondsReturn {
    double valueToReturn =0;

    public double ConvertExpiredBonds(HashMap <Integer, float[]> arrayOfBonds,int currentMonth){
        valueToReturn = 0;
        Set<Integer>positionInHashMap = arrayOfBonds.keySet();

        for (Integer keyForMonthBond : positionInHashMap){
            if (keyForMonthBond == currentMonth){
                float[] specificMonthBond = arrayOfBonds.get(keyForMonthBond);
                valueToReturn += specificMonthBond[1]; 
                arrayOfBonds.remove(keyForMonthBond);
            }
        }

        return valueToReturn;
    }
}
