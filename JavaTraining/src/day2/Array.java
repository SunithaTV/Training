package JavaTraining.src.day2;

import java.util.ArrayList;
import java.util.Arrays;
//collection of similar data types-optimize the code, any data ocation can be got by indexposition
//disadvantage is size limited
//can have all access specifiers
public class Array {
    public static void main(String[] args){
        int[] abc1= new int[10];
        String[] str=new String[10];
       int[] abc={10,20,30,40,50,60,70,80,90,100,0};
        String[] name={"john","Chris"};

        System.out.println(abc[6]);
        System.out.println("length of array is:"+abc.length);
        for (int i=0;i<abc.length;i++){
            System.out.println(abc[i]);
        }
        for (int i=0;i<abc.length;i++){//to show what are the indexes
           abc[i]=i;
            System.out.println(abc[i]);
        }
        ArrayList<String> namelist = new ArrayList<>(Arrays.asList("man","voo"));

        System.out.println(namelist.get(0));

    }
}
