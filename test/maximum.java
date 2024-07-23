public class maximum {
    public static void main(String[] args) {
        int[] ar = { 100, 150, 23, 4, 9, 45, 18 };
        int max = 0;
        int smax = 0;
        for (int i = 0; i <= ar.length - 1; i++) {
            if (max < ar[i]) {
                max = ar[i];
            } else {
                if (max == smax) {
                    smax = ar[i];
                }

                else {
                    if (smax < ar[i]) {
                        smax = ar[i];
                    }

                }
            }

        }
        System.out.println(max);
        System.out.println(smax);
    }
}
