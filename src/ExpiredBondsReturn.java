import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ExpiredBondsReturn {
    double valueToReturn =0;

    public double ConvertExpiredBonds(ConcurrentHashMap <Integer, float[]> arrayOfBonds,int currentMonth){
        valueToReturn = 0;
        Set<Integer>positionInHashMap = arrayOfBonds.keySet();
        for (Integer keyForMonthBond : positionInHashMap){
            if (keyForMonthBond == currentMonth){
                float[] specificMonthBond = arrayOfBonds.get(keyForMonthBond);
                valueToReturn += specificMonthBond[0]; 
                arrayOfBonds.remove(keyForMonthBond);
                positionInHashMap.remove(keyForMonthBond);
            }
        }
        return valueToReturn;
    }
}
