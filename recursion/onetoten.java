public class onetoten {
    static void onetote(int a){
        if(a<20){
            System.out.println(a);
            onetote(a+1);
        }
    }
    public static void main(String[] args){
        onetote(1);
    }
}
