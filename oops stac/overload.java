class Myover{
    static void abc(){
        System.out.println("hello");
    }
    static void abc(int a){
        System.out.println("venki");
    }
    static void abc(String a){
        System.out.println("hello venki");
    }
}
public class overload {
    public static void main(String[] args) {
        Myover ob1=new Myover();
        ob1.abc();
        ob1.abc(10);
        ob1.abc("null");

    }
}

/*creating of class-methods are created with the same name with different 
parameters thn function call throught a object is known as overload  */
