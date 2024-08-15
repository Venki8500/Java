public class secondgreat {
    public static void main(String[] args) {
        int[] ar={1,2,5,6,8,9,10,42,4};
        int max=0; 
        int smax=0;
        for(int i=1;i<=ar.length-1;i++){
           if(max<ar[i]){
            smax=max;
            max=ar[i];

           }
            if(smax<ar[i] || smax==max ){
                smax=ar[i];
            }

        }
 
        System.out.println(max);
        System.out.println(smax);
    
    }
 
}
