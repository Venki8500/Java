public class seventynine {
    public static void main(String[] args) {
        String s="venkatesh";
        int[] ar=new int[s.length()];
        int count=0;
        for(byte i=0;i<=s.length()-1;i++){
            int x=0;
            char c=s.charAt(i);
            x=(int)c;
            ar[i]=x;
            count=count+1;
            // System.out.println(x);
        }
        System.out.println(count);
    }
}
