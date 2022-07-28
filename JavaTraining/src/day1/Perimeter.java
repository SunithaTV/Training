package Day1;

import static java.lang.Math.PI;

public class Perimeter {
   double r =4.5;
     final double pi=3.14;

    public static void main(String[]args){
        new Perimeter().circleRadius();
    }
    public void circleRadius() {
        double perimeter=2* PI*r;
        double area=pi*r*r;
        System.out.println((perimeter));
        System.out.println(area);
    }
}
