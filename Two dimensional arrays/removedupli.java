public class removedupli {
    public static void main(String[] args) {
        int[] ar = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5 };
        int j;
        for (int i = 0; i <= ar.length - 1; i++) {
            for (j = i; j > 0; j--) {
                if (ar[i] == ar[j - 1]) {
                    break;
                }

            }
            if (j == 0) {
                System.out.println(ar[i]);
            }
        }

    }

}
