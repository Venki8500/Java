public class numbers3 {
    static void num(int a){
        if(a>0){
            System.out.println(a);
            num(a-1);
        }
    }
    public static void main(String[] args) {
        num(10);
    }
}
