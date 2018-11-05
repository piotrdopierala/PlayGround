package pl.dopierala.CodeWars;

public class FindParityOutlier {
    static int[] test1 = {Integer.MAX_VALUE, 0, 1};

    public static void main(String[] args) {
        System.out.println(find(test1));
    }


    static int find(int[] ints) {
        int evnCount = 0;
        int oddCount = 0;
        boolean searchEven=false;

        for (int i = 0; i < 3; i++) {
            if (ints[i] % 2 == 0) { //is even
                evnCount++;
            } else
                oddCount++;
        }

        if(evnCount<oddCount)
            searchEven=true;

        for (int element : ints) {
            if(element%2==0){
                if(searchEven)
                    return element;
            }else
                if(!searchEven)
                    return element;
        }

        return 0;
    }


}
