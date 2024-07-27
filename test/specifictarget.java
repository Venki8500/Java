public class specifictarget {
    public static void main(String[] args) {
        int[] ar={20,10,5,15,25,30};
         for(int i=0;i<ar.length-1;i++){
            // System.out.println(ar[i]);
            for(int j=ar.length-1;j>1;j--){
                if(ar[i]+ar[j]==35){
                    System.out.println(ar[i]+" "+ar[j]);
                }
            }
         }
    }
}
