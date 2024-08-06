public class thirty {
    public static void main(String[] args) {
        int[] ar={2,3,4,5,6,7,8,9,11,13,15,18};
        for(int i=0;i<=ar.length-1;i++){
            if(ar[i]%2==0 && ar[i]%3==0){
                System.out.println(ar[i]);
            }
        }
       
    }
}
