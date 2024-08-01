public class sumofnatural {
  
    static int sumx(int a,int b,int sum){
           if(a==10){
               return 10;
             }
        else{
            return a+sumx(a+1,b,sum);
        }
        
            
    }
   
    public static void main(String[] args) {
        int x=sumx(1,10,0);
        System.out.println(x);
    }
}
