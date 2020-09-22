package sk.jurij;
import static java.lang.Math.*;

public class Equality {
    public static int equal(int a, int b, int c){
        int[] arr = {a,b,c};
        short count = 0;
        for (int  i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++)
            if (arr[i] == arr[j]) count++;
        }
        return (count > 4) ? (int)sqrt(count) : 0;
    }
}
