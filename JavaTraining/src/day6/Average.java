package JavaTraining.src.day6;

import java.util.Scanner;

public class Average {
    public static int Average(int x,int y,int z){
        return (x+y+z)/3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number: ");
        int z = in.nextInt();
        System.out.print("The average value is " + Average(x, y, z ));
    }
    }

    //Inheritance - shapes class, Permiter , Area method - to avoid code duplication so we extend this class to sub class , so parent class variables and methods available on subclass
//Shapes can be square, rextangle etc so need to be used across different shapes

//Polymorphism - Method Overloading
//In java run time polymorphism is achiceved with inheritance and method overriding
// Same method can be working in different ways - Multiplication can be done with two or 3 digit, this will be overriding existing method

