public class three {
    static void sortNums(int a,int b,int c){
        if(a<b && a<c){
         System.out.println(a+" "+b+" "+c);
        }
        if(b<c && b<a){
            System.out.println(b+" "+c+" "+a);
        }
      if(c<a && c<b){
        System.out.println(c+" "+b+" "+a);
      }
        

    }
    public static void main(String[] args) {
         sortNums(11,9,68);
        
    }
}
