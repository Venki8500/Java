import java.util.Scanner;
public class seventynine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sum=0;
        int a=5;
        for(int i=1;i<=a;i++){
            int x= input.nextInt();
            if(x>0){
                sum=sum+x;
            }
           
        }
        System.out.println(sum/a);
    }
}
