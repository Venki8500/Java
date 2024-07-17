import java.util.Scanner;
public class sixtythree {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x= input.nextInt();
        int y=input.nextInt();

        int min=0;
        int max=0;

        if(x>y){
            max=x;
            min=y;

        }
        else{
            max=y;
            min=x;
        }
        for(int i=1;i<=min;i++){
            if((max*i)%min==0){
System.out.println(max*i);
break;
            }
        }
    }
}
