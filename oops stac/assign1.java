public class assign1 {
    public static void main(String[] args) {
        int n = 9;

    
        for (int i =7; i < 11; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
               
                    if (i % j == 0) {
                        c = c + 1;
                    }
                }
              
                if (c == 2) {
                    System.out.println(i);
                }
            }
            

        }

    }

//// pending////