package sk.jurij.exercises;

public class TriangleCheck {
    public static boolean isTriangle(int a, int b, int c){
        int[] arr = {a,b,c,a,b};
        for (byte  i = 0; i < 3; i++)
            if (arr[i] + arr[i + 1] <= arr[i + 2])
                return false;
        return true;
    }
}