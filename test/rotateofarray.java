import java.util.Scanner;

public class rotateofarray {
    public static void main(String[] args) {
        int[] ar = { 10, 15, 24, 29, 12, 18, 5, 9, 2, 58, 44, 55 };
        int temp;
        int j;
        for (int i = 1; i <= ar.length - 1; i++) {
            temp = ar[i];
            for ( j = i; j > i; j--) {
                if (temp < ar[j + 1]) {
                    ar[j] = ar[j + 1];
                } else {
                    break;
                }
            }
            ar[j] = temp;
        }
        for(int x=1;x<=ar.length-1;x++){
            System.out.print(ar[x]+" ");
        }

    }
}
