import java.util.Scanner;
public class stack{
    public static void main(String[] args) {
        class stackcclass{
            int[] st;
            int tos;
         
            stackcclass(){
                this.st=new int[5];
                this.tos=-1;
            }
             void push(int a){
                if(tos==st.length-1){
                    System.out.print("stack overflow");
              }
              else{
                this.st[++tos]=a;
                this.display();
              }
             }

             void pop(){
                if(tos==-1){
                    System.out.println("stack is empty");
                }
                else{
                    this.tos--;
                    display();
                }
             }
            
           
        }
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
     

    }
}