import java.util.concurrent.ConcurrentHashMap;

public class BuyNewBounds {
    private int amountOfBoundsYouCanBuyNow = 0;
    private double restAfterBought =0;
    private int expireTime=0;
    private double priceOfOneBound =0;
    private double interest=0;
    
    
    BuyNewBounds(int expireTime, double priceOfOneBound,double interest){
            this.expireTime = expireTime;
            this.priceOfOneBound = priceOfOneBound;
            this.interest = interest;
    }
    
    public ConcurrentHashMap <Integer, float[]> buyNew(ConcurrentHashMap <Integer, float[]> ListOfBonds, int currentMonth, double budgetForThisMonth){

        if(budgetForThisMonth >= priceOfOneBound){
        amountOfBoundsYouCanBuyNow = (int)(budgetForThisMonth/priceOfOneBound);
        restAfterBought = budgetForThisMonth - (amountOfBoundsYouCanBuyNow*priceOfOneBound);

        float[]bondsForThisMonth = {(float)(amountOfBoundsYouCanBuyNow*priceOfOneBound),(float)interest};
        int expireIn = currentMonth+expireTime;
        ListOfBonds.put(expireIn, bondsForThisMonth);
        }

        return ListOfBonds;
    }

    public double changeAfterBuyingBonds(){
        return restAfterBought;
    }
    public double youBoughtThisMany(){

        return 0;
    }
}
