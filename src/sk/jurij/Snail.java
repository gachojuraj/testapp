package sk.jurij;

public class Snail {
    public static double TotalDistance(double stepHeight, double stepLength, double height){
        return ((height*stepLength)/stepHeight)+height;
    }
}
