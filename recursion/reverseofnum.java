public class reverseofnum {
    static void rev(int a){
        int rem=0;
        int sum=0;
        if(a!=0){
         rem=a%10;
         sum=sum*10+rem;
         a=a%10;
         rev(a-1);
        }
        System.out.print(sum+" ");
        
    }
    public static void main(String[] args) {
        rev(543);
    }
}




///////////pending//////////
