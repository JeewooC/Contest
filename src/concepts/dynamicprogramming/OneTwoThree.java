package concepts.dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class OneTwoThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] d = new int[12];
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;

        int T = in.nextInt();
        in.nextLine();

        int[] inputs = new int[T];

        for (int i = 0; i < T; i++) {
            inputs[i] = in.nextInt();
            in.nextLine();
        }

        for (int index = 0; index < T; index++) {
            int n = inputs[index];

            if (d[n] != 0) {
                System.out.println(d[n]);
            } else {
                for (int i = 4; i <= n; i++) {
                    d[i] = d[i-1] + d[i-2] + d[i-3];
                }
                System.out.println(d[n]);
            }
        }
    }
}
