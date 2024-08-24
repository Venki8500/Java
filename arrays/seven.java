public class seven {
    static void palindrome(int a){
        int rem=0;
        int rev=0;
        int temp=a;
        while(a>0){
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        if(rev==temp){
        System.out.println("is a plaindrome");  
          }
        else{
            System.out.println("not a palindrome");
        }
    }
    public static void main(String[] args) {
        palindrome(1451);
    }
}
