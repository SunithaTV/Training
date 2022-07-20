package JavaTraining.src.Day2;

public class Search {
    public static void main(String[]args)
    {
        int arr[] = {5, 1, 4, 9, 7, 2, 6, 10};
        int toCheckValue =4;
        boolean test = false;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == toCheckValue) {
                System.out.println("Is " + toCheckValue
                        + " present in the array: ");
                test=true;
            }
        }
           if(!test)
           {System.out.println("Is " + toCheckValue
                    + " not present in the array: ");
        }
    }
}



