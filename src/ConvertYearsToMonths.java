
public class ConvertYearsToMonths {
    int returnValueInMonths = 0;
    ConvertYearsToMonths(String yearsToConvert){
        if(yearsToConvert.contains("y")) { 
        
            returnValueInMonths = Integer.parseInt(yearsToConvert.replaceAll("y", ""));
            returnValueInMonths = returnValueInMonths * 12;
        }
        else {
            returnValueInMonths = Integer.parseInt(yearsToConvert);
        }
    }

    public int ReturnConvertedValue(){
        return returnValueInMonths;
        
    }

}
