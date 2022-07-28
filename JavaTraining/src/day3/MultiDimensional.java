package JavaTraining.src.day3;

public class MultiDimensional {
    public static void main(String[] args) {
        int a[][]={{1,1},{2,3},{4,5}};
        int b[][]={{1,2,3},{4,5,6}};
        int c[][]=new int[2][2];
        int d[][]=new int [5][6];//row,column
        c[0][0]=2;
        c[0][1]=3;
        c[1][0]=4;
        c[1][1]=5;
        int i,k;
        for(i=0; i<2; i++){
            for(k=0;k<2;k++){
                System.out.println(c[i][k]);
            }
        }


        for(i=0; i<2; i++){
            for(k=0;k<2;k++){
                System.out.println(a[i][k]);
            }
        }
        for(i=0;i<2;i++){
            for(k=0;k<3;k++){
                System.out.println(b[i][k]);
            }}

        System.out.println(c[0][1]);


    }

}
