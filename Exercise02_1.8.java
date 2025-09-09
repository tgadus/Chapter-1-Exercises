public class CircleMetrics {
    public static void main(String[] args) {
        double radius = 5.5;
        double pi = Math.PI;

        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;

        System.out.println("Radius: " + radius);
        System.out.println("Perimeter of the circle: " + perimeter);
        System.out.println("Area of the circle: " + area);
    }
}