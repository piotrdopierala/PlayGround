package pl.dopierala.Fibonacci;

import java.util.Scanner;

/**
 * pl.dopierala.Fibonacci's  numbers generation
 * comparision btw. recursive and loop method.
 */
public class Fibo_MainClient {
    public static void main(String[] args) {
        System.out.println("Obliczam ciag Fibonnacci do n miejsca.");
        System.out.println("Podaj n:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Iteracyjnie wyszło:"+fiboLoop(n));
        System.out.println("Rekurencyjnie wyszło:"+fiboRecursive(n));
    }

    private static int fiboRecursive(int n){
        if(n==1)
            return 1;
        if(n==0)
            return 0;
        return fiboRecursive(n-1)+fiboRecursive(n-2);

    }

    private static int fiboLoop(int n){
        int fn1=0;
        int fn2=0;
        int f=0;

        for (int i = 0; i <= n; i++) {
            f=fn1+fn2;
            if(i==1)
                f=1;
            fn2=fn1;
            fn1=f;
        }

        return f;
    }

}
