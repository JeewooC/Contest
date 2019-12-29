package concepts.dynamicprogramming.fibonaccipattern;

public class MinJumps {
    public static int minJumps(int[] jumps) {
        int[] d = new int[jumps.length];
        d[0] = 0;

        for (int i = 1; i < d.length; i++) {
            d[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < d.length; i++) {
            for (int j = i+1; j <= i+jumps[i] && j < d.length; j++) {
                d[j] = Math.min(d[j], d[i] + 1);
            }
        }
        return d[jumps.length-1];
    }

    public static void main(String[] args) {
        int[] jumps1 = {2, 1, 1, 1, 4};
        int[] jumpss = {1, 1, 3, 6, 9, 3, 0, 1, 3};

        System.out.println(minJumps((jumps1)));
        System.out.println(minJumps((jumpss)));
    }
}
