public class even {
    static void even(int a, int b) {
        if (a <= b) {
            if (a % 2 == 0) {
                 System.out.println(a);

            }
            even(a + 1, b);
        }

    }

    public static void main(String[] args) {
        even(1, 20);
    }
}
