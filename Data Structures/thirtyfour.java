public class thirtyfour {
    public static void main(String[] args) {
        int[] ar={30000,50000,60000,90000};
        double a=0.1;
        double b=0.12;
        for(int i=0;i<=ar.length-1;i++){
             if(ar[i]<=50000){
                double c=ar[i]-ar[i]*a;
                System.out.println(c);

             }
             if(ar[i]>50000){
                double f=ar[i]-ar[i]*b;
                System.out.println(f);
             }
        }
    }
}
