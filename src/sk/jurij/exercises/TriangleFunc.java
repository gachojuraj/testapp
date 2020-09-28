package sk.jurij.exercises;

import sk.jurij.classes.Triangle;

public class TriangleFunc {
    public static double getArea(Triangle triangle){
        double s = (triangle.a + triangle.b + triangle.c) / 2.0;

        return Math.sqrt(s*(s-triangle.a)*(s-triangle.b)*(s-triangle.c));
    }

    public static double getPerimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }
}