import java.util.Scanner;
public class eightynine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int sum=0;
        int rem=0;
        int temp=x;
        while(x>0){
          rem=x%10;
            sum=sum*10+rem;
            x=x/10;
         
        }
        if(temp==sum){
            System.out.println(sum+": is a palindrome");
        }
        else{
            System.out.println(sum+": is not a palindrome");
        }
    }
}
