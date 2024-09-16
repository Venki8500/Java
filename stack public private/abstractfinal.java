class A {
    int x = 100; // base class//

    void callme() {
        System.out.println("call from A");
    }

}

class B extends A {
    int y = 200;

    void callme() {
        System.out.println("call from B ");
    } // devired class//
}

class C extends A{
    int z=300;
    void callme(){
        System.out.println("call from C");
    }
}

public class abstractfinal {
    public static void main(String[] args) {
        A oa1;
        oa1= new B();    /// resulted the callme from B because of override/// in this the callme
                                  /// assigned for B class and in this class the A has x=100 property
        oa1.callme();
        
         oa1=new C();   /*(A oa1 references to the two different objects of B and C at run-time)*/

        oa1.callme();   ///run-time polymorphism//
       
       
                      // A o1=new B(); //it can be assigned but not accessible //


        // System.out.println(ob1.x);
    }
}
