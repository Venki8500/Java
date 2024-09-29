class Emplpoyee{
    public int x;
    private int y;
    int z;
    Emplpoyee(int a,int b,int c){
        this.x=a;
        this.y=b;
        this.z=c;
    }
    private void abc(){
        System.out.println("hello abc");
    }
    public void xyz(){
     abc();
    }
}
public class publicmethod {
    public static void main(String[] args) {

        Emplpoyee e1=new Emplpoyee(100,200,300);
        System.out.println(e1.x);
        // System.out.println(e1.y);
        System.out.println(e1.z);
        e1.xyz();
    }
    
}
