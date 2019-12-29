package concepts.dynamicprogramming.knapsackpattern;

public class SubsetSum {
    public static boolean canPartition(int[] num, int sum) {
        Boolean[][] d = new Boolean[num.length][sum+1];
        return canPartitionHelper(d, num, sum, 0);
    }

    public static boolean canPartitionHelper(Boolean[][] d, int[] num, int sum, int currentIndex) {
        if (sum == 0) {
            return true;
        }

        if (num.length == 0 || currentIndex >= num.length) {
            return false;
        }

        if (d[currentIndex][sum] == null) {
            if (num[currentIndex] <= sum) {
                if (canPartitionHelper(d, num, sum - num[currentIndex], currentIndex + 1)) {
                    d[currentIndex][sum] = true;
                    return true;
                }
            }

            d[currentIndex][sum] = canPartitionHelper(d, num, sum, currentIndex + 1);
        }

        return d[currentIndex][sum];
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 7, 1, 5};
        System.out.println(canPartition(num, 10));

        int[] num1 = {1, 2, 3, 7};
        System.out.println(canPartition(num1, 6));

        int[] num2 = {1, 3, 4, 8};
        System.out.println(canPartition(num2, 6));
    }
}

