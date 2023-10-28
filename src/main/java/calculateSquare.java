public class calculateSquare {
    public static void main(String[] args)
    {
        double area = calculateSquareArea(20);

        System.out.println("Площадь квадрата" + area);
    }
    public static double calculateSquareArea(double side)
    {
        double area = side * side;

        return area;
    }
}
