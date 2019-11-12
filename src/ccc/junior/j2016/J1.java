package ccc.junior.j2016;

import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        int winCount = 0;

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            String s = in.nextLine();
            if (s.equals("W")) {
                winCount++;
            }
        }

        if (winCount <= 0) {
            System.out.println(-1);
        } else if (winCount <= 2) {
            System.out.println(3);
        } else if (winCount <= 4) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }
}
