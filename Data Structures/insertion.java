public class insertion {
    public static void main(String[] args) {
        int temp;
        int k;
        int[] ar={6,5,3,1,8,7,2,4};
        
        for(int i=1;i<=ar.length-1;i++){
            temp=ar[i];
            for(k=i;k>0;k--){
                if(temp<ar[k-1]){
                    ar[k]=ar[k-1];

                }
                else{
                    break;
                }
              
            }
            
            ar[k]=temp;
            
        }
        for(int m=0;m<=ar.length-1;m++){
            System.out.println(ar[m]);
        }
    }
}
