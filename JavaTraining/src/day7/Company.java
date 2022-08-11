package JavaTraining.src.day7;

import java.util.Arrays;
import java.util.List;

public class Company {
    public static void main(String[] args) {

        Employee emp = new Employee("Sam", 10000);
        Employee emp1 = new Employee("Sam1", 5000000);
        Employee emp2 = new Employee("Sam2", 600000);
        Employee a[] = {emp, emp1, emp2};
        Arrays.sort(a, new java.util.Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o2.empSalary, o1.empSalary);
            }
        });
        System.out.println(a[0].empName + " "+ a[0].empSalary);

      //List<Employee> emp=null;
       // emp.add(new Employee("Sam","200"));
       //Employee1 temp=new ArrayList<>();;
       // for (int i = 0; i <emp.size() ; i++) {
          // if(emp.get(i).salary>emp.get(i+1).salary){
        //temp=emp.get(i);
        //else{
        //temp=emp.get(i+1);
       // }
        //system.out.println(temp.salary)
    }}



