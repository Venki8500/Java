import java.util.Scanner;
public class twentytwo {
     static int dia(int a){
        int dia=2*a;
        return dia;
     }
     static double cir(int b){
        double cir=2*3.14*b;
        return cir;
     }
     static double area(int c){
        double are=3.14*c*c;
        return are;
     }

    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.println("enter radius");
       int x=input.nextInt();
       int xx=dia(x);
        System.out.println("diameter:"+xx);
    
       double yy=cir(x);
       System.out.println("circumference:"+yy);
       
       double zz=area(x);
       System.out.println("area:"+zz);
    }
}
