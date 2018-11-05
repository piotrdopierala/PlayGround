package pl.dopierala.CodeWars;

import java.util.Arrays;
import java.util.OptionalInt;

public class SupermarketQueue {
    public static void main(String[] args) {


        int[] customers = { 7,4,4,4,6,1};
        System.out.println(queueTime(customers, 5));
    }

    public static int queueTime(int[] customers, int noCheckouts) {
        int cusIndex = 0;
        int[] checkouts = new int[noCheckouts];
        int timeWait = 0;
        OptionalInt min = OptionalInt.empty();

        while (!min.isPresent() || min.getAsInt()>0) {
            if (min.isPresent()) {
                for (int i = 0; i < checkouts.length; i++) {
                    checkouts[i] -= min.getAsInt();
                }
            }
            if(cusIndex<customers.length) {
                for (int i = 0; i < checkouts.length; i++) {//fill checkouts with customers
                    if (checkouts[i] == 0) {
                        checkouts[i] = customers[cusIndex];
                        cusIndex++;
                        if(cusIndex>=customers.length)
                            break;
                    }
                }
                min = Arrays.stream(checkouts).min();
            }else {
                min = Arrays.stream(checkouts).max();
                return timeWait+min.getAsInt();
            }
            timeWait += min.getAsInt();
        }
        return 0;
    }

}


