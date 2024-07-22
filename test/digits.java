public class digits {
    public static void main(String[] args) {
        int a=113;
        int rem=0;
        int sum=0;
        
        while(a>0){
            rem=a%10;


            a=a/10;
            sum=sum+rem;
           
        }
        System.out.println(sum);
        
    }
}
