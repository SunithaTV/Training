package JavaTraining.src.day4;

public class StringMatrix {
    public static void main(String[] args) {
        String[][] stringArray = new String[3][3];
        stringArray[0][0] = "a";
        stringArray[0][1] = "b";
        stringArray[0][2] = "c";
        stringArray[1][0] = "d";
        stringArray[1][1] = "e";
        stringArray[1][2] = "f";
        stringArray[2][0] = "g";
        stringArray[2][1] = "h";
        stringArray[2][2] = "i";
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(stringArray[i][j] + "\t");

            }
            System.out.println();
        }
}
    }


