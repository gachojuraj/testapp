package sk.jurij;

public class Triangle {
    public static boolean isTriangle(int a, int b, int c){
        int[] arr = {a,b,c,a,b};
        for (int i = 0; i < 3; i++){
            if (arr[i+1] > arr[i+2] == false) return false;
        }
        return true;
    }
}
