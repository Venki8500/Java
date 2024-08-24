import java.util.Scanner;
public class seventeen {
    int m;
    static boolean armstrong(int a){
        int rem=0;
        int temp=a;
        int sum=0;
        int rev=0;
        while(a>0){
            rem=a%10;
            a=a/10;
           rem=rem*rem*rem;         
           sum=sum+rem;
        }
        if(sum==temp){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int x=input.nextInt();
        boolean ven=armstrong(x);
        System.out.println(ven);
    }
}
