import java.util.Scanner;
public class twentyfour {
    static void evenorodd(int a){
        if(a%2==0 ){
            System.out.println("even");
        }
        if(a%2==1){
            System.out.println("odd");
        }

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        evenorodd(x);
       
    }
}
