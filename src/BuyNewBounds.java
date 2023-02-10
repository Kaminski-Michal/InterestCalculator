import java.util.HashMap;

public class BuyNewBounds {
    private int amountOfBoundsYouCanBuyNow = 0;
    private double restAfterBought =0;
    
    
    BuyNewBounds(HashMap <Integer, float[]> ListOfBonds, int currentMonth, double budgetForThisMonth, int expireTime, double priceOfOneBound){

        if(budgetForThisMonth >= priceOfOneBound){
            amountOfBoundsYouCanBuyNow = (int)(budgetForThisMonth/priceOfOneBound);
            restAfterBought = budgetForThisMonth - (amountOfBoundsYouCanBuyNow*priceOfOneBound);
        }
    }

    public double changeAfterBuyingBonds(){
        return restAfterBought;
    }
    public double youBoughtThisMany(){

        return 0;
    }
}
