package Day2;

public class Variables {
   static int d=100;//static variables doesn't require creating instance
   public int c=200;//instance variable declared inside class and not method
    //public can be accessible in all packages
    //protected is package level, cannot be accessible another package. By default all is protected
    //inside method local variable
    //instance variable can be called directly except on static method, for static method create new instance
    public void add(){
        int a=10;
        int b=20;
        System.out.println(a+b);
        System.out.println(d);
    }

    public static void main(String[] args) {
        System.out.println("static variable =" +d);
        System.out.println(new Variables().c);
        new Variables().add();
    }
}
