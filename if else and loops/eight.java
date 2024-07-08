import java.util.Scanner;
public class eight {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int v= input.nextInt();
     if(v>99 && v<999){
        System.out.println("3 digited number");
     }
     else{
        System.out.println("not a 3 digited number");
     }
    }
}
