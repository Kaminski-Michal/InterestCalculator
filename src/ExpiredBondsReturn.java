import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class ExpiredBondsReturn {
    double valueToReturn =0;

    public double ConvertExpiredBonds(float[][] arrayOfBonds,double currentMonth,int expireTime){

        valueToReturn = 0;
        for(int i = 0;i<(arrayOfBonds.length + expireTime); i++){
            
            if(arrayOfBonds[i][0] == currentMonth){

                valueToReturn += arrayOfBonds[i][1]; //! add basic value
            }

            
        }
        return valueToReturn;
    }
}
