public class thirtytwo {
    public static void main(String[] args) {
        int[] ar={10,20,30,40,11};
        System.out.println(ar[0]);
        for(int i=0;i<=ar.length-1;i++){
            ar[i]=ar[i]*5;
            // System.out.println(br[i]);
        }
        int[] br = ar;
        System.out.println(br[0]);
    }
}
