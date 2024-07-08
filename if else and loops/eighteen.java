import java.util.Scanner;
public class eighteen {
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
     int x= input.nextInt();
     int y= input.nextInt();
     int z=input.nextInt();
     int sum=(x+y+z);
     int p= sum/300*100;
     
// if((p==200) && (p<300){
//     System.out.)println(p+"is A-grade");
// }
// if((p==100)&& (p<200)){
//     System.out.println(p+"is B-grade");
// }
// if((p==50)&& (p<100)){
//     System.out.println(p+"is C-grade");
// }
System.out.println(p);
        }
}
