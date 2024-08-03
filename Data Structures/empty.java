public class empty {
    public static void main(String[] args) {
        int[] ar = { 10,20,30};
        int[] br = {};
        for (int i = 0; i <= ar.length - 1; i++) {
              br=ar;
           System.out.print(" "+br[i]);
        }
    }
}
