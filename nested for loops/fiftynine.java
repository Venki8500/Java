import java.util.Scanner;
public class fiftynine {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int x= input.nextInt();

    int i=4;
    int j=1;
    int d=0;
    while(j<=i){
        d=x%10;
        x=x/10;
        j++;
    }
    System.out.println(d);
    }
}
