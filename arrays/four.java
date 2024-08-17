public class four {
    static int fact(int a){
     int fac=1;
     for(int i=1;i<=a;i++){
        fac=fac*i;

     }
     return fac;
    }
    public static void main(String[] args) {
        int facto= fact(6);
        System.out.println(facto);
    }
}
