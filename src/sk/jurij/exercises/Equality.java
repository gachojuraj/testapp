package sk.jurij.exercises;

public class Equality {
    public static int equal(int a, int b, int c){
        if (a == b || a == c || b == c)
            return (b == c && b == a) ? 3 : 2;
        return 0;
    }
}
