package JavaTraining.src.day6;


public class Rectangle {
        public static int Area(int l,int b) {
                int c = l * b;
                System.out.println(c);
                return c;
        }
        public static void main(String[] args) {
                Rectangle obj= new Rectangle();
                obj.Area(4,5);
                obj.Area(5,8);
        }
        }


