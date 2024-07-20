import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x= input.nextInt();
        int rem=0;
        int sum=0;
        while(x>0){
            rem=x%10;
            x=x/10;
            sum=sum*10+rem;
            
        }
        System.out.println(sum);
        
    }
}
