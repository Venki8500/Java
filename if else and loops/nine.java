import java.util.Scanner;
public class nine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int y= input.nextInt();
        if(y%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}
