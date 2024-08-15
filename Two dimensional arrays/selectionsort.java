public class selectionsort {
    public static void main(String[] args) {
        int[] ar = { 3, 2, 1, 5, 6, 7, 8, 9, 4 };

        int temp = 0;
        for (int i = 0; i <= ar.length - 1; i++) {
            int min = ar[i];

            for (int j = i + 1; j <= ar.length - 1; j++) {
                if (min > ar[j]) {
                    min = ar[j];
                    temp = ar[i];
                    ar[j] = ar[i];
                    ar[i] = min;
                }
            }
        }
       for (int m = 0; m <= ar.length - 1; m++) {
            System.out.print(ar[m] + " ");
        }
    }
}
