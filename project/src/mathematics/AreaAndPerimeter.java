package mathematics;

public class AreaAndPerimeter {
    public static double calculateCircleArea(double radius) {
        
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateCirclePerimeter(double radius) {
      
        return 2 * Math.PI * radius;
    }
}
