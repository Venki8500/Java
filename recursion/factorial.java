public class factorial {
    static int facto(int a){
        if(a==1){
            return 1;
        }
        else{
            return a*facto(a-1);
        }
    }
public static void main(String[] args) {
    int res=facto(10);
    System.out.println(res);
}
}
