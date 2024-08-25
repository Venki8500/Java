import java.util.Scanner;

public class six {
    static boolean prime(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count = count + 1;
            }

        }
        if (count == 2) {  
            return true;
        } else {
            return false;

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        boolean n = prime(x);
        System.out.println(n);
    }
}
