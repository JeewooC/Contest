package ccc.senior.s2019;

import java.util.Scanner;

public class S4 {
    public static int tourism(int K, int[] scores) {
        // N divided by K = number of times K fits in scores
        // N modulus K = length left after all N fitted in
        // ex. 5 = 2 + 3 or 3 + 2
        // ex. 8 = 2 + 3 + 3 or 3 + 2 + 3 or 3 + 3 + 2
        // ex. 10 = 1 + 3 + 3 + 3 or 3 + 1 + 3 + 3 or 3 + 3 + 1 + 3 or 3 + 3 + 3 + 1
        // it has to be done this way because it has to be the fewest number of days possible

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        in.nextLine();

        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = in.nextInt();
        }

        System.out.println(tourism(K, scores));
    }
}
