public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }


    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}