public class seventyseven {
    public static void main(String[] args) {
        String s="venkatesh";
        int[]ar=new int[s.length()];
        
        for(byte i=0;i<=s.length()-1;i++){
            int temp;
        
            int x=0;
            char c=s.charAt(i);
            x=(int)c;
            ar[i]=x;
             System.out.println(x);
          
            // for(int j=1;j<=ar.length-1;j++){
            //     if(ar[j]>ar[j+1]){
            //         temp=ar[j];
            //         ar[j]=ar[j+1];
            //         ar[j+1]=temp;
                    
            //     }
            //     System.out.println(ar[j]);
            // }
        }                                                                                             
    }
}
