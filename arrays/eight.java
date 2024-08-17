public class eight {

    static void digits(int a) {
        int rem = 0;
        int rev = 0;
        while (a > 0) {
            rem = a % 10;
            a = a / 10;

            System.out.println(rem);
        }
 
    }

    public static void main(String[] args) {

        digits(12345);

    }

}
