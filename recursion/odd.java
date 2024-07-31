public class odd{
    static void odd(int a,int b){
        if(a<=b){
            if(a%2==1){
               System.out.println(a);
             }
          odd(a+1, b);
        }
    }
    public static void main(String[] args) {
        odd(10,30);
        
    }
}