import java.util.Scanner;
public class twelve {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x= input.nextInt();
        int y= input.nextInt();                                          //DESCENDING ORDER//

        if(x>y){
            System.out.println(x);
            System.out.println(y);
        }
        else{
            System.out.println(y);
            System.out.println(x);
        }
        

    }
}
