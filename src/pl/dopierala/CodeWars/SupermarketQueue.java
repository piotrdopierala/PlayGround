package pl.dopierala.CodeWars;

import java.util.*;

public class SupermarketQueue {
    public static void main(String[] args) {


        int[] customers = {10,2,3,3,3};
        System.out.println(queueTime3(customers, 2));
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
                        if(cusIndex>=customers.length) {
                            min = Arrays.stream(checkouts).max();
                            return timeWait+min.getAsInt();
                        }
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

    public static int queueTime2(int[] customers, int noCheckouts){
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < noCheckouts; i++) {
            q.add(0);
        }
        for (int customer : customers) {
            q.add(q.remove()+customer);
        }
        return Collections.max(q);
    }

    public static int queueTime3(int[] customers,int noCheckouts){
        int[] checkouts = new int[noCheckouts];
        for (int i = 0; i < customers.length; i++) {
            checkouts[0]+=customers[i];
            Arrays.sort(checkouts);
        }
        return checkouts[noCheckouts-1];
    }

}


