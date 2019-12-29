package ccc.senior.s2017;

import java.util.Scanner;

public class S1 {
//    start from 0 and always record the highest possible K
//    take input and split into two integer arrays
//    two sums one for each team
//    add the number of runs of each day and if they are equal then update K
//    loop until the end of both arrays

    public static int equalRuns(int N, int[] t1, int[]t2) {
        int K = 0;
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < N; i++) {
            sum1 += t1[i];
            sum2 += t2[i];

            if (sum1 == sum2) {
                K = i+1;
            }
        }

        return K;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        int[] swifts = new int[N];
        for (int i = 0; i < N; i++) {
            swifts[i] = in.nextInt();
        }
        in.nextLine();

        int[] semaphores = new int[N];
        for (int i = 0; i < N; i++) {
            semaphores[i] = in.nextInt();
        }

        System.out.println(equalRuns(N, swifts, semaphores));

    }

}
