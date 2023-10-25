public class calculateTriangle {
    public static void main(String[] args) {
        double area = calculateTriangleArea(8, 6, 4);
        System.out.println("Площадь треугольника:" + area);
    }
    public static double calculateTriangleArea(double side1, double side2, double side3) {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        return area;
    }
}
