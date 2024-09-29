public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("blue", true, 4.0);
        Rectangle rect = new Rectangle(2.0, 5.0, "green", false);
        Square square = new Square(4.0, "red", true);

        System.out.println("Circle");
        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());
        System.out.println("Color = " + circle.getColor());
        System.out.println("String = " + circle.toString());
        System.out.println(" ");

        System.out.println("Rectangle");
        System.out.println("Width = " +  rect.getWidth());
        System.out.println("Length = " + rect.getLength());
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());
        System.out.println("String = " + rect.toString());
        System.out.println(" ");

        System.out.println("Square");
        System.out.println("Side = " + square.getLength());
        System.out.println("String = " + square.toString());




    }
}