public class seventyfive {
    public static void main(String[] args) {
        String a = "venki";
        int[] ar = new int[a.length()];
        for (byte i = 0; i <= a.length() - 1; i++) {
            // System.out.println(ar[i]);
            int x = 0;
            char h = a.charAt(i);
            x = (int) h;
            ar[i] = x;
            // System.out.println(ar[i]);

        }
        for(int v=0;v<=ar.length-1;v++){
            int temp;
            for(int j=0;j<=ar.length-2;j++){
              if(ar[j]>ar[j+1]){
                 
                 temp=ar[j];
                 ar[j]=ar[j+1];
                 ar[j+1]=temp;
               }
            }
        }
        for(int m=0;m<=ar.length-1;m++){
            System.out.println(ar[m]);
        }

    }
}
