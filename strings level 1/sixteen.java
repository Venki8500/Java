public class sixteen {
    public static void main(String[] args) {
        String s="eye";
        String s1="";
    
        for(int i=s.length()-1;i>=0;i--){
            // System.out.println(s.charAt(i));
            s1=s1+s.charAt(i);
            
           }
        //    System.out.println(s1);
           if(s1.equals(s)){
            System.out.println("palindrome");
           }
           else{
            System.out.println("not a palindrome");
           }

        }
        
        
    }



