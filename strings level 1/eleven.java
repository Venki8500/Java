import java.util.Scanner;
public class eleven {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        char x=input.next().charAt(0);
       for(int i=0;i<s.length();i++){
     
        if(s.charAt(i)==x){
            System.out.println("true");
       
        }
        else{
            System.out.println("false");
        }

      }
    
     }
    
    }

