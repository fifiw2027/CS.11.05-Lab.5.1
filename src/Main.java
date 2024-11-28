import java.util.Arrays;

public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int sum = 0;
        for(int i: totalWasteKgPerCapitaPerYear) sum +=i;
        return (int) Math.round((sum/totalWasteKgPerCapitaPerYear.length)+0.5);
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {

    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        int sum = 0;
        for (int i : householdEstimatesTonnesPerYear) {
            sum += i;
        }
        return (int)(10 * Math.round((double)sum / householdEstimatesTonnesPerYear.length)) / 10;
    }}

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        int sum = 0;
        for (int i:retailEstimatesKgPerCapitaPerYear){sum += i;}
        return (int) Math.round(sum * 1.0 / retailEstimatesKgPerCapitaPerYear.length);
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        int sum = 0;
        for (int i:retailEstimatesTonnesPerYear){
            sum += i;
        }
        return (int) Math.round(sum*1.0/retailEstimatesTonnesPerYear.length);
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {

    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        int result = 0;
        for(int food : foodServiceEstimatesTonnesPerYear) {
            result += food;
        }
        return result/foodServiceEstimatesTonnesPerYear.length+1;

    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int result = 0;
        Arrays.sort(totalWasteKgPerCapitaPerYear);
        if(totalWasteKgPerCapitaPerYear.length%2==1){
            result = totalWasteKgPerCapitaPerYear[totalWasteKgPerCapitaPerYear.length/2];
        }
        else if(totalWasteKgPerCapitaPerYear.length%2==0){
            int num1 = totalWasteKgPerCapitaPerYear[totalWasteKgPerCapitaPerYear.length/2];
            int num2 = totalWasteKgPerCapitaPerYear[(totalWasteKgPerCapitaPerYear.length/2) + 1];
            result = (num1 + num2) / 2;
        }
        return result;
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        int median = 0;
        Arrays.sort(householdEstimatesKgPerCapitaPerYear);
        int middleNum = householdEstimatesKgPerCapitaPerYear[householdEstimatesKgPerCapitaPerYear.length/2];
        if(householdEstimatesKgPerCapitaPerYear.length%2 == 0){
            int afterMiddle = householdEstimatesKgPerCapitaPerYear[householdEstimatesKgPerCapitaPerYear.length/2+1];
            median = (middleNum + afterMiddle)/2;
        }
        else{
            median = middleNum;
        }
        return median;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        Arrays.sort(householdEstimatesTonnesPerYear);
        int length = householdEstimatesTonnesPerYear.length;
        int median;
        if(length%2==0) {
            median = (householdEstimatesTonnesPerYear[length / 2 - 1]) + (householdEstimatesTonnesPerYear[length / 2]) / 2;
        }
        else{
            median = householdEstimatesTonnesPerYear[length/2];
        }
        return median;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        Arrays.sort(retailEstimatesKgPerCapitaPerYear);
        if (retailEstimatesKgPerCapitaPerYear.length % 2 == 0) {
            int median = (retailEstimatesKgPerCapitaPerYear[(retailEstimatesKgPerCapitaPerYear.length/2)] + retailEstimatesKgPerCapitaPerYear[(retailEstimatesKgPerCapitaPerYear.length/2)-1]) / 2;
        }
        else {
            int median = retailEstimatesKgPerCapitaPerYear[(retailEstimatesKgPerCapitaPerYear.length)/2];
        }
        return median;
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        Arrays.sort(retailEstimatesTonnesPerYear);
        int length = retailEstimatesTonnesPerYear.length;
        int med;
        if (length % 2 == 0) {
            med = (retailEstimatesTonnesPerYear[length / 2 - 1] + retailEstimatesTonnesPerYear[length / 2]) / 2;
        } else {
            med = retailEstimatesTonnesPerYear[length / 2];
        }
        return med;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Max Methods
     */

    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Misc Methods
     */

    public static String getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        String result = "";
        for(int i=0; i<countries.length; i++) {
            if (countries[i].equals(country)) {
                result = result + totalWasteKgPerCapitaPerYear[i];
            } else {
                result = result;
            }
        }
        return result;
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        String result = "";
        for (int i=0; i<countries.length; i++){
            for (int k=0; k<countries.length;k++){
                if(totalWasteKgPerCapitaPerYear[i]>totalWasteKgPerCapitaPerYear[k]) {
                    result = result + countries[i];
                }
                else{
                    result = result;
            }
            }
        }
        return result;
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty)
    {
        double[] newPercentage = new double[percentagesShareInPoverty.length];
        for(int i=0; i<countries.length; i++) {
            if (percentagesShareInPoverty[i] > percentagesShareInPoverty[i + 1]) {
                newPercentage[i + 1] = newPercentage[i];
                countries[i + 1] = countries[i];
            } else {
                countries = countries;
            }
            return countries;
        }

    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences)
    {
        Arrays.sort(confidences);

    }
}
