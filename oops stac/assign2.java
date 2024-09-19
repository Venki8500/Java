public class assign2 {
    public static void main(String[] args) {
        class Emplpoyee{
            int x=100;
            static int y=200;
        }
            Emplpoyee e1=new Emplpoyee();
           Emplpoyee e2=new Emplpoyee();
           e1.x++;
        //    e2.y++;
           e1.y=e1.y+55;
           System.out.println(e1.x);
           System.out.println(e2.y);
           System.out.println(e1.y);
           System.out.println(Emplpoyee.y);

     
    }
   
    

}
