import java.util.Scanner;
public class fiftyfourfive {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    for(int i=1;i<=5;i++){
        int x = input.nextInt();
        if(x%2==0){
            System.out.println(x);
        }
    }
        
    }
}
