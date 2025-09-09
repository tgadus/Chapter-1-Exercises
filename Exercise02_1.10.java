public class AverageSpeed {
    public static void main(String[] args) {
        double kilometers = 14.0;
        double totalMinutes = 45.0 + 30.0 / 60.0; // 45 minutes and 30 seconds
        double hours = totalMinutes / 60.0;

        double miles = kilometers / 1.6;
        double averageSpeed = miles / hours;

        System.out.println("Distance in miles: " + miles);
        System.out.println("Time in hours: " + hours);
        System.out.println("Average speed in miles per hour: " + averageSpeed);
    }
}