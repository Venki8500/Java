public class fibanocci {
    static int fibanocci(int a) {
        if (a == 0) {
            return 0;
        }
        if (a == 1) {
            return 1;
        }
        return fibanocci(a - 1) + fibanocci(a - 2);
    }

    public static void main(String[] args) {
        int res = fibanocci(3);
        System.out.println(res);

    }
}
