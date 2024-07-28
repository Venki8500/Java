public class strongnumber {
    public static void main(String[] args) {
        int a = 145;
        int sum = 0;
        while (a > 0) {

            int rem = a % 10;
            a = a / 10;

            int fact = 1;
            for (int i = rem; i >= 1; i--) {

                fact = fact * i;

            }
            sum = sum + fact;

        }
        System.out.println(sum);
    }
}
