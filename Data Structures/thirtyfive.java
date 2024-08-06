public class thirtyfive {
    public static void main(String[] args) {
        int[] ar={3,5,7,9,10,12,16};
        for(int i=0;i<=ar.length-1;i++){
            if(ar[i]%2==1){
                if(ar[i]%3==0){
                    System.out.println(ar[i]);
                }
                
            }
        }
    }
}
