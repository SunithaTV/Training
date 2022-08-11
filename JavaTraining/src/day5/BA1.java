package JavaTraining.src.day5;

public class BA1 {
    int accNo;
    static int id=1000;
    float curBal;
    public BA1() {
        accNo=id++;
    }

    public static int get() {
        return id;

    }

    public static void main(String[] args) {
     BA1 ba =new BA1();
        System.out.println(get());
    }
}
