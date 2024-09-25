public class overloading {
    static void abc(){
System.out.println("hello");
    }
    static void abc(int a){
        System.out.println("venki");
    }
    static void abc(String s){
        System.out.println("code your career");
    }

    public static void main(String[] args) {
        abc();
        abc(5);
        abc("venki");
    }
}
