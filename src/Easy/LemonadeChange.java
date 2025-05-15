package Easy;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0] != 5) {
            return false;
        }

        int counterOf5 = 0;
        int counterOf10 = 0;

        for(int num : bills) {
            if(num == 5) {
                counterOf5++;
            } else if(num == 10 && counterOf5 > 0) {
                counterOf5--;
                counterOf10++;
            } else {
                if(counterOf5 > 0 && counterOf10 > 0) {
                    counterOf5--;
                    counterOf10--;
                } else if (counterOf5 >= 3) {
                    counterOf5 = counterOf5 - 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
