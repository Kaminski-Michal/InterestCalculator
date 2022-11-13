public class AddInterest {
    
    private double valueToReturn = 0;
    private double takenInTax = 0;

    private double taxTaken = 0;
    private double earnFromThisBond = 0;
    public double CalculateInterest(float[][] arrayOfBonds,double currentMonth,int expireTime,int tax){

        for (int i = 0; i< arrayOfBonds.length; i++){
            
            if (arrayOfBonds[i][0] == currentMonth){
                taxTaken = ((arrayOfBonds[i][1]*arrayOfBonds[i][2]/100) * tax/100);
                earnFromThisBond = ((arrayOfBonds[i][1]*arrayOfBonds[i][2] / 100)-taxTaken);
            }

            takenInTax =+ taxTaken;
            valueToReturn =+ earnFromThisBond;
        }

        return valueToReturn;
    }

}
