package concepts.dynamicprogramming.fibonaccipattern;

import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] d = new int[N+1];

        d[1] = 1;
        d[2] = 1;
        d[3] = 2;
        d[4] = 4;

        for (int i = 5; i <= N; i++) {
            d[i] = d[i-1] + d[i-3] + d[i-4];
        }

        System.out.println(d[N]);

        // testcase: 6
        // 1 1 1 1 1 1
        // 1 1 1 3
        // 1 1 3 1
        // 1 3 1 1
        // 3 1 1 1
        // 3 3
        // 1 1 4
        // 1 4 1
        // 4 1 1
        // output: 9
    }
}
