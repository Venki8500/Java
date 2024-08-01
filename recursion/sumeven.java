public class sumeven {
    static void even(int a,int b){
        int sum=0;
        if(a%2==0){
             System.out.println(a);
            // sum=sum+(a);
        }
        if(a<=b){
            
            even(a+1, b);
      
        }
        // System.out.println(sum);
    }
    public static void main(String[] args) {
       even(5,20);
        
    }
}


/////////pending////////