package sk.jurij.exercises;

public class Multiply {
    public static int[] MultiplyByLength(int[] arr){
        for (short i = 0; i < arr.length; i++)
            arr[i] *= arr.length;
        return arr;
    }
}
