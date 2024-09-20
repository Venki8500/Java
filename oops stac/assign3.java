public class assign3 {
    public static void main(String[] args) {
        int a = 179;
        int rem;
        int sum = 0;

        while (a > 0) {
            rem = a % 10;
            sum = sum * 10 + rem;
            a = a / 10;
        }
        int c = 0;
        for (int i = 1; i <= sum; i++) {

            if (sum % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not a prime");
        }
    }
}
