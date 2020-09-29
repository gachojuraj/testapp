package sk.jurij.exercises;

public class TriangleCheck {
    public static boolean isTriangle(int a, int b, int c){
        return (a+b>c && a+c>b && b+c>a);
    }
}