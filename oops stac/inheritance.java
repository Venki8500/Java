class parent {
    int x = 100;

    parent() {
        System.out.println("parent constructor called ");
    }

    void abc() {
        System.out.println("parent abc");
    }

   protected void xyz() {
        System.out.println("parent xyz");
    }
}

// base class
class child extends parent {
    int y = 200;

    child() {
        System.out.println("child constructor called");
    }

    void abc() {
        System.out.println("child abc");
          super.xyz();

    }

    // void xyz() {
    //     System.out.println("child xyz");

    // }
}

// derived class
public class inheritance {
    public static void main(String[] args) {
        // parent o1=new parent();
        child o2 = new child();
        o2.abc();
        // System.out.println(o2.x);
        // System.out.println(o2.y);
    }
}

/*
 * in this the class is define at the top and main cls and main method can be
 * defined next
 */
/*
 * in this inheritance the child can access the parent property by creating the
 * child object but not parent to child
 */
/*
 * by calling the constructor through the object firstly the parent class
 * constructor will be called first
 */
/*
 * in this inheritance the function abc is defined in parent and child while
 * calling through the object the child
 * function is called and printed
 */
/*
 * another function is defined on parent class and this is called on child
 * function which can be executed
 */
/* super keyword acts as reference to the parent class function */
/*over riding is also known as run-time polymorphism */
/*over riding process is also known as late binding */
/*over riding process is also known as dynamic binding */
/* overloading is known as compile-time polymorphism */
/* overloading process is also known as static binding*/