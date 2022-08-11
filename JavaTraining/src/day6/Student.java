package JavaTraining.src.day6;

public class Student {
    int rollNo;
    String name;
    int phoneNo;
    String address;
    public Student() {
        this.name = name;
        this.rollNo = rollNo;
    }
    public Student(int rollNo, int phoneNo, String address) {
        this.rollNo = rollNo;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public static void main(String[] args) {
        Student obj= new Student();
        obj.name="John";
        obj.rollNo=2;
        Student stu2 = new Student(12, 802, "mm");
        Student stu1 = new Student(11, 800, "dd");
        System.out.println("Sam"  +" " +stu1.rollNo + " "+ stu1.phoneNo+" " + stu1.address );
        System.out.println("John"  +" " +stu2.rollNo + " "+ stu2.phoneNo+" " + stu2.address );
    }
}
