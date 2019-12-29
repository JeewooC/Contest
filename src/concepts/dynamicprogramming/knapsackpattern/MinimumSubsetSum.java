package concepts.dynamicprogramming.knapsackpattern;

public class MinimumSubsetSum {
    public static int minimumDifference(int[] num) {
        int total = 0;
        for (int n : num) {
            total += n;
        }
        int half = total/2;

        boolean[][] d = new boolean[num.length][half+1];

        for (int i = 0; i < num.length; i++) {
            d[i][0] = true;
        }

        for (int s = 1; s <= half; s++) {
            if (num[0] == s) {
                d[0][s] = true;
            } else {
                d[0][s] = false;
            }
        }

        for (int i = 1; i < num.length; i++) {
            for (int s = 1; s <= half; s++) {
                if (d[i-1][s]) {
                    d[i][s] = true;
                } else if (num[i] <= s) {
                    d[i][s] = d[i-1][s-num[i]];
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int s = 0; s <= half; s++) {
            if (d[num.length-1][s]) {
                max = Integer.max(max, s);
            }
        }

        return (total-max) - max;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 9};
        int[] num2 = {1, 2, 7, 1, 5};
        int[] num3 = {1, 3, 100, 4};

        System.out.println(minimumDifference(num1));
        System.out.println(minimumDifference(num2));
        System.out.println(minimumDifference(num3));
    }

}
