import java.util.Arrays;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        int[] ar = { 10, 15, 24, 29, 12, 18, 5, 9, 2, 58, 44, 55 };
       int[] br=new int[ar.length];
       int[] cr=new int[ar.length];
       int inc=0;
       int ind=0;
       for(int i=0;i<=ar.length-1;i++){
        if(ar[i]%2==0){
            br[inc]=ar[i];
            inc++;


        }
        if(ar[i]%2==1){
            cr[ind]=ar[i];
            ind++;
        }
       }
       System.out.println(Arrays.toString(br));
       System.out.println(Arrays.toString(cr));

       }
}
