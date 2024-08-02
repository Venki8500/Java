import java.util.Scanner;
public class eighteenjava {
    public static void main(String[] args) {
        int[] ar={23,34,54,10,34,7,23,10,34};
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        int ind=-1;
        int c=0;
        for(int i=0;i<=ar.length-1;i++){
            
            if(ar[i]==k){
               
                c++;
               
            }
      
        }
        if(c==0){
            System.out.println("not there");
      
           }
           else{
            System.out.println("is in an array repeated for times:"+c);
          
           }
    }                                                           
}
