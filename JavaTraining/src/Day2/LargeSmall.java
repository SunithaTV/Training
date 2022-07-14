package JavaTraining.src.Day2;

public class LargeSmall {
    public static void main (String[] args) {
        int[] numbers= {2, 6, 7, 6, 2, 19, 1, 19};
        int max = numbers[0];
        int min = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            } else if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Largest number : " + max);
        System.out.println("Smallest number : " + min);
    }
}
