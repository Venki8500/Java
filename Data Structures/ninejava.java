public class ninejava {
    public static void main(String[] args) {
        int[] ar={23,34,54,0,4,7};
        int min=0;
        for(int i=0;i<=ar.length-1;i++){
            if(min>ar[i]){
             min=ar[i];
            }
            
        }
        System.out.println(min);
    }
}
