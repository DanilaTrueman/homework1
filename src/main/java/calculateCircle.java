public class calculateCircle {
    public static void main(String[] args)
    {
        double area = calculateCircleArea(8.5);

        System.out.println("Площадь круга:" + area);
    }
    public static double calculateCircleArea(double radius)
    {
        double area = Math.PI * radius * radius;

        return area;
    }
}
