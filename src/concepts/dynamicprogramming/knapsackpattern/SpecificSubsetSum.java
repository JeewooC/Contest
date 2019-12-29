package concepts.dynamicprogramming.knapsackpattern;

public class SpecificSubsetSum {
    public static int subsetsWithSpecifiedSum(int[] num, int sum) {
        Boolean[][] d = new Boolean[num.length][sum+1];

        for (int i = 0; i < num.length; i ++) {
            d[i][0] = true;
        }

        for (int s = 1; s <= sum; s++) {
            if (num[0] == s) {
                d[0][s] = true;
            } else {
                d[0][s] = false;
            }
        }

        for (int i = 1; i < num.length; i++) {
            for (int s = 1; s <= sum; s++) {
                if (d[i-1][s]) {
                    d[i][s] = true;
                } else if (num[i] <= s) {
                    d[i][s] = d[i-1][s-num[i]];
                } else {
                    d[i][s] = false;
                }
            }
        }

        int count = 0;
        for (Boolean[] arr : d) {
            if (arr[sum]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 1, 2, 3};
        int[] num2 = {1, 2, 7, 1, 5};

        System.out.println(subsetsWithSpecifiedSum(num1, 4));
        System.out.println(subsetsWithSpecifiedSum(num2, 9));
    }
}
