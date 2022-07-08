package Day2;

public class DataTypes {
    //primitive(int, bool, char) and non primitative(string, object)
    Boolean one= false;//true or false
    byte a=-128;//127 to -128
    short c=32000;//-32768 to 32767
    int i=1000;
    long l=222L;
    float f=-2.0f;
    int s=67;
    char lette='A';
//variable overflow if we go beyod limit
    public static void main(String[] args) {
        int a=10;
        float f= a;//widening going from low to high value
        System.out.println(f);
//narrowing -going to high to low value
        float fl=10.5f;
        int b=(int)fl;//typecasting
        System.out.println(b);
        byte aa=10;
        byte bb=10;
        byte cc= (byte) (aa+bb);
        System.out.println(cc);

    }


}
