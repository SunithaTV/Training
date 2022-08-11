package JavaTraining.src.day6;

public class Employee {
    String name;
    int year;
    int salary;
    String address;
    public  Employee(  String name,int year,int salary,String address) {
        this.name =name;
        this.year = year;
        this.salary = salary;
        this.address = address;
    }
    public static void main(String[] args) {
        Employee obj= new Employee("Robert", +1994,+500,"64C-WallStreet");
        Employee obj2= new Employee("Sam", +2000,+50,"68D-WallsStreet");
        Employee obj3= new Employee("John", +1999,+50,"26B-WallsStreet");
        System.out.println( obj.name + " "+ obj.year+" " + obj.salary+"  "+obj.address );
        System.out.println( obj2.name + " "+ obj2.year+" " + obj2.salary+"  "+obj2.address );
        System.out.println( obj3.name + " "+ obj3.year+" " + obj3.salary+"  "+obj3.address );
    }
}
