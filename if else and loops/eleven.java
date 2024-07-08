import java.util.Scanner;
public class eleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x < y) {
            System.out.println(x+"is least number");
        } else {
            System.out.println(y+"is least number");
        }
    }
}

    
