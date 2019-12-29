package ccc.senior.s2017;

import java.util.Arrays;
import java.util.Scanner;

public class S2 {
//    separate the N integers into an array
//    sort the array
//    split the array in half into low tide and high tide arrays
//    reverse the low tide array
//    make a new array of size N
//    loop from 0 to less than N/2
//    from the low tide array add the first element and then add the first element from the high tide array
//    if N is an odd number then there must be another low tide measurement so add the final low tide element to the end

    public static int[] reverseArray(int[] arr){
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length-1-i];
        }
        return reversed;
    }

    public static void tideMeasurements(int N, int[] lowTide, int[] highTide) {
        int[] result = new int[N];
        for (int i = 0, j = 0; i < N/2; i++) {
            result[j++] = lowTide[i];
            result[j++] = highTide[i];
        }

        if (N % 2 != 0) {
            result[N-1] = lowTide[lowTide.length-1];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        int[] allMeasurements = new int[N];
        for (int i = 0; i < N; i++) {
            allMeasurements[i] = in.nextInt();
        }

        Arrays.sort(allMeasurements);
        int[] lowTide = reverseArray(Arrays.copyOfRange(allMeasurements, 0, (int) Math.round(N/2.0)));
        int[] highTide = Arrays.copyOfRange(allMeasurements, (int) Math.round(N/2.0), N);

        tideMeasurements(N, lowTide, highTide);
    }
}
