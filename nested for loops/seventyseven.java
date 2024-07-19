import java.util.Scanner;
public class seventyseven {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int x= input.nextInt();
     int count=0;
       for(int i=1;i<=x;i++){                              
        if(x%i==0){
            count =count +1;
            
        }
       
       }
       if(count==2){
        System.out.println("is a prime number");
      }
      else{
        System.out.println("is not a prime number");
      }
    }
}
