abstract class shape {
    void abc() {
        System.out.println("just to mention area");
    } /*
       * in this abstract class we should be directly calls within the class to the
       * child class(circle class) should be defined by the
       * "abstract void soandso()",, and the other class can be defined in the
       * abstract class without getting of any errors in resulted
       */

    abstract void area();

    /* abstract method should be implemented in the child class, no mplementation
    returns errors and class should not be created*/ 
    abstract void perimeter();

}

class circle extends shape {
    int radius = 0;

    circle(int x) {
        this.radius = x;
    }

    void area() {
        System.out.println(3.14 * this.radius * this.radius);
    }

    void perimeter() {
        System.out.println(2 * 3.14 * this.radius);
    }
}

class square extends shape {
    int side = 0;

    square(int x) {
        this.side = x;
    }

    void area() {
        System.out.println(this.side * this.side);
    }

    void perimeter() {
        System.out.println(4 * this.side);
    }
}

public class shapeutility {
    public static void main(String[] args) {
        shape s1 = new circle(10); /*
                                    * class shape is base class circle is derived class , in this the object is
                                    * created for shape and assigned for circle to access the circle class
                                    * properties
                                    */
         s1.area(); /* this is circle class property */
         s1.perimeter(); /* this is circle class property */
         s1 = new square(10); /*
                            //   * class shape is base class square is derived class , in this the object is
                            //   * created for shape and assigned for square to access the square class
                            //   * properties
                            //   */
        // s1.area(); /* this is square class property */
    }
}
