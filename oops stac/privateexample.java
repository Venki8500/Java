public class privateexample {
    public static void main(String[] args){
         class employee{
            int y=200;
            employee(){
                System.out.println("employee constructor called");
            }
            void abc(){
                System.out.println("employee abc");
            }
       private void xyz(){
                System.out.println("employee xyz");
            }
         }
         class teacher extends employee{
            int x=100;
            teacher(){
                System.out.println("teacher constructor called");
            }
            void abc(){
                System.out.println("teacher abc");
                super.xyz();
            }
            void xyz(){
                System.out.println("teacher xyz");
            }
         }
         teacher o1=new teacher();
         o1.abc();
    }
}



///fundamental of obbject oriented programming system
/*encapsulation*/
/*abstraction*/
/*inheritance*/
/**/