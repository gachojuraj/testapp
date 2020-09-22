package sk.jurij.excercises;

public class Equality {
    public static int equal(int a, int b, int c){
        int[] arr = {a,b,c};
        byte count = 0;
        for (byte  i = 0; i < 3; i++)
            for (byte j = 0; j < 3; j++)
                if (arr[i] == arr[j] && i != j){
                    count++;
                    break;
                }
        return count;
    }
}
