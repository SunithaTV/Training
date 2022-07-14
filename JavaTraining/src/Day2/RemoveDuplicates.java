package JavaTraining.src.Day2;

public class RemoveDuplicates{
    public static void main(String[] args)
{
    int[] numbers= {2, 6, 7, 6, 2, 19, 1, 19};
    for (int i = 0; i < numbers.length; i++){
        boolean duplicate = false;
        int b = 0;
        while (b < i){
            if (numbers[i] == numbers[b])
                duplicate = true;
            b++;}
        if (duplicate == false)
            System.out.print(numbers[i] + " ");}
}
}

