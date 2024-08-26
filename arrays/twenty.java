import java.util.Scanner;
public class twenty {
    
    static int cube(int a){
        int b=a*a*a;
    
       
    
    return b;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int x=input.nextInt(); 
        int res=cube(x);
        System.out.println(res);
    }
}
