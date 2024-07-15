import java.util.Scanner;
public class eightyfour {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x= input.nextInt();
       
        int rem=0;
        int max=0;
        while(x>0){
            rem=x%10;
            if(max<rem){
                max=rem;
            }
            x=x/10;
        }
        System.out.println(max);
    }
}
