public class sorting {
    public static void main(String[] args) {
        int[] ar={1,3,5,6,4,2};
     
        for(int i=0;i<=ar.length-1;i++){
           
            for(int j=0;j<=ar.length-2-i;j++){
               
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
                
             
            }
           
            
        }
        System.out.println(ar[ar.length-2]);
        
        }
    }


