public class sum {
     static int num(int a,int b){
     if(b==1){
        return 1;
     }
     else{
        return a+b+num(a,b-1);
     }
     }
    public static void main(String[] args) {
       int res= num(0,10);
       System.out.println(res);
    }
}
