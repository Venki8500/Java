public class thirtythree {
    public static void main(String[] args) {
        int[] ar={10000,20000,30000,40000};
        double hra=0.4;
        double da=0.92;
        double t=0.1;
        int[] br={};
        for(int i=0;i<=ar.length-1;i++){
           double b=ar[i]+ar[i]*hra+ar[i]*da-ar[i]*t;
        //    ar=br;
           System.out.println(b);
        }
    }
}
