public class employeessalary{
    public static void main(String[] args) {
         class employee{
            String fullname;
            int basic;
            int hra;
            int da;
            int pfund;
            double ptax;

            employee(String a,int b,int c,int d,int e,double f){
                this.fullname=a;
                this.basic=b;
                this.hra=c;
                this.da=d;
                this.pfund=e;
                this.ptax=f;

            }
           double getsalary(){
            return  this.basic+this.basic*((double)(this.hra)/100)+this.basic*((double)(this.da)/100)-2*this.pfund-this.basic*((double)(this.ptax)/100);
          
            }
       
         }
         employee e1=new employee("mani",100000,20,70,2000,2.0);
         employee e2=new employee("nikhil",100000,20,70,2000,2.0);
         employee e3=new employee("subic",100000,20,70,2000,2.0);


         double res1=e1.getsalary();
         double res2=e2.getsalary();
         double res3=e3.getsalary();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}