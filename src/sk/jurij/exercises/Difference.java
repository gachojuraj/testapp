package sk.jurij.exercises;

import java.util.Arrays;

public class Difference {
    public static int differenceMaxMin(int[] arr){
        return Math.abs(Arrays.stream(arr).max().getAsInt()
                - Arrays.stream(arr).min().getAsInt());
    }
}