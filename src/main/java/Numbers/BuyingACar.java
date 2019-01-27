package Numbers;

public class BuyingACar {
    public int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int monthsNumber = 0;
        float updatedOldPrice = startPriceOld, updatedNewPrice = startPriceNew, actualMoney = startPriceOld;

        while (actualMoney < updatedNewPrice) {
            actualMoney -= updatedOldPrice;
            updatedOldPrice -= updatedOldPrice * (percentLossByMonth / 100);
            updatedNewPrice -= updatedNewPrice * (percentLossByMonth / 100);
            actualMoney += savingperMonth + updatedOldPrice;
            if (monthsNumber % 2 == 0) {
                percentLossByMonth += 0.5F;
            }
            monthsNumber++;
        }
        return new int[]{monthsNumber, Math.round(actualMoney - updatedNewPrice)};
    }
}
