package ccc.junior.j2016;

import java.util.Scanner;

public class J2 {

    public static void main(String[] args) {
        int[][] square = new int[4][4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                square[i][j] = in.nextInt();
                in.nextLine();
            }
            in.nextLine();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(square[i][j]);
            }
            System.out.println("\n");
        }

//        int first = Integer.getInteger(square[0][0]);
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                if (Integer.getInteger(square[i][j]) != first) {
//                    System.out.println("not magic");
//                    break;
//                }
//            }
//        }
    }
}
