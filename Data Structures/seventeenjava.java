import java.util.Scanner;
public class seventeenjava {
    public static void main(String[] args) {
        int[] ar={23,34,54,10,4,7};
        Scanner input=new Scanner(System.in);
        int x= input.nextInt();
        boolean isThere=false;
        for(int i=0;i<=ar.length-1;i++){
            if(x==ar[i]){
                isThere=true;
                break;
            }
          
           
        }
        if(isThere==true){
            System.out.println("number is there in an array");
        }
        else{
            System.out.println("not there");
        }
    }
}
