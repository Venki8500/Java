class A {
    int x = 100;
}

class B extends A {
    int y = 200;
}

class C extends B {
    int z = 300;
}

public class inheritancetypes {
    public static void main(String[] args) {
        C o1 = new C();
        System.out.println(o1.x);
        System.out.println(o1.y);
        System.out.println(o1.z);
    }
}
/* these type of inheritance is known as MULTI-LEVEL inheritance */
/*
 * in this the parent class is inhritance to child class and again child
 * class(like parent class) is inheritance to another child class
 */
/*
 * in this the first child acts as a parent child which the child class is
 * assigned to it ..
 */


 /*when the C class is extends to B and A it doesnt work in java because of the interference 
  * this is know as MUTLIPLE INHERITANCE*/
  /*in this the C is child class the B and A are parent class 4--
   * .
  */
