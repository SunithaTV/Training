package Day1;

import Day2.Variables;

public class Swap {

    static int a=10, b=5,temp;
    public static void main(String args[])
    {
        temp = a;
        a = b;
        b = temp;
        System.out.println("temp=" + temp);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        //no sepeate variable
        a=a+b;//15
        b=a-b;//10
        a=a-b;//5
    }
}
