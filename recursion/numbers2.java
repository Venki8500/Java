public class numbers2 {
    static void numbers(int a,int b){
        if(a<=b){
            System.out.println(a);
            numbers(a+1,b);
        }
    }
    public static void main(String[] args) {
        numbers(10,20);
    }
}
