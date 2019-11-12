package ccc.senior.s2018;

import java.util.Collections;
import java.util.Scanner;

public class S1 {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }

    public static double[] selectionSort(double[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        int[] villagePositions = new int[N];
        for (int i = 0; i < N; i++) {
            villagePositions[i] = in.nextInt();
            in.nextLine();
        }

        int[] sortedPositions = selectionSort(villagePositions);
        double[] spacesBetween = new double[N-2];

        for (int i = 1, index = 0; i < N-1; i++, index++) {
            spacesBetween[index] = (sortedPositions[i] - sortedPositions[i-1])/2.0 +
                    (sortedPositions[i+1] - sortedPositions[i])/2.0;
        }

        double[] spacesBetweenSorted = selectionSort(spacesBetween);
        System.out.println(spacesBetweenSorted[0]);
    }
}
