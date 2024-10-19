abstract class Shape {
    String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double area();

    @Override
    public String toString() {
        return "This is " + shapeName;
    }
}
