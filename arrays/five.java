import java.util.Scanner;
public class five {
    static int reverse(int a) {
        int rem = 0;
        int rev = 0;
        while (a > 0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;

        }
        return rev;

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int x = input.nextInt();
        int renum=reverse(x);
        System.out.println(renum);
    }
}
