import java.util.Scanner;
public class fiftysix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         int n= input .nextInt();
         while(n!=0){
            int rem=n%10;
            System.out.println(rem);
            n=n/10;
         }

    }
}
