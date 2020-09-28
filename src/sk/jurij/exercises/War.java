package sk.jurij.exercises;

public class War {
    public static int warOfNumbers(int[] arr){
        int even = 0, odd = 0;
        for (int i : arr){
            if (i % 2 == 0) even += i;
            else odd += i;
        }
        return Math.abs(even - odd);
    }
}