public class two {
    static int great(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        if(b>c && b>a){
            return b;
        }
        else{
            return c;
        }
           
        
    }
 
    
    public static void main(String[] args) {
        int greatest= great(45,67,23);
      System.out.println(greatest);
}

}