import java.util.Scanner;
public class additionofarray {
   public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int k= input.nextInt();

      int[] ar = { 23, 34, 54, 10, 4, 7 };

      int min = ar[0];
      for (int i = 1; i <= ar.length - 1; i++) {
         if (k==ar[i]) {
            System.out.println(k+": is there");
         }
         

      }

      
   }
}
