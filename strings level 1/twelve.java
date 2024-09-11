import java.util.Scanner;
public class twelve {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char s=input.next().charAt(0);
        String a="edupoly";
        for(int i=0;i<=a.length()-1;i++){
             if(s==a.charAt(i)){
               System.out.println(i);
             }
        }
    }
}
