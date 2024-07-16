import java.util.Scanner;
public class fiftyfive {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int min=0;
        int max=0;

        for(int i=1;i<=5;i++){
            int x= input.nextInt();
            if(i==0){
                min=x;
                max=x;
            }
            else{
                if(x<min){
                    min=x;
                }
                if(x>max){
                    max=x;
                }  
            }
          
          
           
            }
            System.out.println("max::"+max);
            System.out.println("min::"+min);
        }
       
       
}
