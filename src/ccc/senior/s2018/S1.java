package ccc.senior.s2018;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class S1 {
    public static <T extends Comparable> T[] selectionSort(T[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        Integer[] villagePositions = new Integer[N];
        for (int i = 0; i < N; i++) {
            villagePositions[i] = in.nextInt();
            in.nextLine();
        }

        Collections.sort(Arrays.asList(villagePositions));
        Double[] spacesBetween = new Double[N-2];

        for (int i = 1, index = 0; i < N-1; i++, index++) {
            spacesBetween[index] = (villagePositions[i] - villagePositions[i-1])/2.0 +
                    (villagePositions[i+1] - villagePositions[i])/2.0;
        }
        Collections.sort(Arrays.asList(spacesBetween));
        System.out.println(spacesBetween[0]);
    }
}
