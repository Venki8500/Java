public class natural {
    static void natural(int a,int b){
        if(b>=a){
            System.out.println(a);
            natural(a+1, b);
        }
    }
    public static void main(String[] args) {
        natural(1,49);
    }
}
