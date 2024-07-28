public class sumofdigitsfive {
  public static void main(String[] args) {
 for (int i= 100; i<= 500; i++) {
      int num=i;
      int sum = 0;
      while (num > 0) {
       int rem = num % 10;
        num = num/ 10;
        sum = sum + rem;

      }

  if(sum==5){
    System.out.println(i);
  }


    }
 

   
  }
}
