public class thirtyone {
    public static void main(String[] args) {
        int[] ar={3,5,9,10,15,18,17,21,23,25,30};
        for(int i=0;i<ar.length-1;i++){
            if(ar[i]%3==0 ||ar[i]%5==0){
                System.out.println (ar[i]);
            }
        }
    }
}
