public class eight {
    public static void main(String[] args) {
        int[][] ar={{10,14,4},{20,5,2},{3,9,11}};
        int max=0;
        for(int i=2;i<=ar.length-1;i++){
            for(int j=0;j<=ar.length-1;j++){
                if(max<ar[i][j]){
                   max=ar[i][j];
                }
               
            }
            System.out.println(max);
        }

      
    }
}
