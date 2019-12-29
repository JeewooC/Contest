package concepts.dynamicprogramming.fibonaccipattern;

public class MinJumpsWithFee {
    public static int minJumpsWithFee(int n, int[] fees) {
        int[] d = new int[n+1];
        d[0] = fees[0];
        for (int i = 1; i <= n; i++) {
            d[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n && j <= i + 3; j++) {
                d[j] = Math.min(d[j], d[i] + fees[j]);
            }
        }

        return Math.min(Math.min(d[n-1], d[n-2]), d[n-3]);
    }

    public static void main(String[] args) {
        int n1 = 6;
        int[] fees1 = {1, 2, 5, 2, 1, 2};

        int n2 = 4;
        int[] fees2 = {2, 3, 4, 5};

        System.out.println(minJumpsWithFee(n1, fees1));
        System.out.println(minJumpsWithFee(n2, fees2));
    }
}
