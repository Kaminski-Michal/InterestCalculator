import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class ExpiredBondsReturn {
    double valueToReturn =0;

    public double ConvertExpiredBonds(float[][] arrayOfBonds,double currentMonth,int tax){

        valueToReturn = 0;
        for(int i = 0;i<arrayOfBonds.length; i++){
            
            if(arrayOfBonds[i][0] == currentMonth){

                valueToReturn = arrayOfBonds[i][1]*arrayOfBonds[i][2]/100; //! add intrest 
                valueToReturn -= arrayOfBonds[i][1]*arrayOfBonds[i][2]/100*tax/100; //! remove tax value
                valueToReturn += arrayOfBonds[i][1]; //! add basic value
            }

        }
        return valueToReturn;
    }
}
