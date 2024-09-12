import java.util.Scanner;
public class one{
    public static void main(String[] args) {
        String s="banana";
        for(int i=0;i<=s.length()-1;i++){
            //System.out.println(s.charAt(i));
            Scanner input=new Scanner(System.in);
            char x=input.nextLine();
            if(s.charAt(i)==x){
                System.out.println(i);
            }
        }
    }
}