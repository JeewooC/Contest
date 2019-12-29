package concepts.dynamicprogramming;

import java.util.Scanner;

public class TwoByNTiles2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] d = new int[101];
        d[1] = 1;
        d[2] = 3;
        for (int i = 3; i <= N; i++) {
            d[i] = d[i-1] + (2 * d[i-2]);
        }
        System.out.println(d[N]);
    }
}
