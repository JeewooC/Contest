package concepts.dynamicprogramming.fibonaccipattern;

import java.util.Scanner;

public class Staircase {
    // ends in either 1 step, 2 step or 3 steps
    // current step is the sum of the sum of the step before, 2 before and 3 before this one
    //
    //
    //
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] d = new int[n+1];

        d[1] = 1;
        d[2] = 2;
        d[3] = 4;

        for (int i = 4; i <= n; i++) {
            d[i] = d[i-3] + d[i-2] + d[i-1];
        }

        System.out.println(d[n]);
    }
}
