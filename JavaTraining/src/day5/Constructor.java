package JavaTraining.src.day5;

public class Constructor {
  int roll;

    public Constructor(int roll, String name, int id) {
        this.roll = roll;
        this.name = name;
        this.id = id;
    }

    String name;
    int id;


    public static void main(String[] args) {
        Constructor myObj=new Constructor(5,"Man",20);
        System.out.println(myObj.name);
        System.out.println(myObj.roll);

    }
    }
    //Access Specifiers
//private variables can be accessed only within a class
//public any where, inherited by subclasses
//protected not accessible outside package
//default -package specific, the one inside class which doesnt have any access specifiers

//Constructor is a special method where you can assign class values, doesnt return anything,
//Overloading - same name method but parameter different- Method overloading with parameter types, With parameter variable type changed(int to double etc)
