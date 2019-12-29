package concepts.dynamicprogramming.fibonaccipattern;

public class HouseThief {
    public static int houseThief(int[] houses) {
        int d[] = new int[houses.length];
        d[0] = houses[0];
        d[1] = houses[1];

        for (int i = 2; i < d.length; i++) {
            d[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < d.length-1; i++) {
            for (int j = i+2; j < d.length; j++) {
                d[j] = Math.max(d[i] + houses[j], d[j]);
            }
        }
        return Math.max(d[d.length-1], d[d.length-2]); // because the thief could end at the last house or the house before depending on where he started (0 or 1)
    }

    public static void main(String[]    args) {
        int houses1[] = {2, 5, 1, 3, 6, 2, 4};
        int houses2[] = {2, 10, 14, 8, 1};

        System.out.println(houseThief(houses1));
        System.out.println(houseThief(houses2));
    }
}
