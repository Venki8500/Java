import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > y) {
            System.out.println(x+"is greater");
        } else {
            System.out.println(y+"is greater");
        }
    }
}
