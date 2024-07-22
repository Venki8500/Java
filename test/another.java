public class another {
    public static void main(String[] args) {
        int[] ar={116,95,8,4,10,49,23,98,117};
        int max=ar[0];
        int smax=ar[0];
        for(int i=1;i<=ar.length-1;i++){
            if(max<ar[i]){
                smax=max;
                max=ar[i];
            }
            else{
                if(smax==max || smax<ar[i]){
                    smax=ar[i];
                }
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
