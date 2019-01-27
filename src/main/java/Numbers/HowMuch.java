package Numbers;

public class HowMuch {
    public String[] howMuch(int m, int n) {
        int money = 0, boatCost = 0, carCost = 0, min, max;
        String moneyRes = "M: ", boatRes = "B: ", carRes = "C: ";

        if (n > m) {
            max = n;
            min = m;
        } else {
            max = m;
            min = n;
        }

        for (int i = min; i <= max; i++) {
            if ((i - 7 * boatCost) == 1) {
                moneyRes.concat(String.valueOf(i));
                boatRes.concat(String.valueOf(boatCost));
                while(carCost * 9 - 37 > 1){
                    if((i - 9 * carCost) == 2){
                        carRes.concat(String.valueOf(carCost));
                    }
                    carCost++;
                }
            }
            boatCost++;
        }

        return new String[]{moneyRes, boatRes, carRes};
    }

}
