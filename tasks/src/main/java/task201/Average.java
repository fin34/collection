package task201;

public class Average {

    public static void main(String[] args) {

        int[] tab = {3, 5, 7, 8, 9, 99, 2, 3, 3, 4, 5, 6, 7, 1, 4, 4, 4, 7, 8, 9, 8};
        int sum = 0;

        for (int i = 0; i <tab.length ; i++) {
            sum+=tab[i];
        }

        System.out.format("%.2f", (double)sum/tab.length);
    }
}
