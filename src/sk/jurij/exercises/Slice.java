package sk.jurij.exercises;

public class Slice {
    public static boolean equalSlices(int slices, int recipients, int each){
        return recipients*each <= slices;
    }
}
