public abstract class Shape {

    // Instance Variables
    double length;
    double width;
    double height;

    // Abstract Methods that will be implemented in sub class
    public abstract double surfaceArea();
    public abstract double volume();
    public abstract String toString();

    // Default Constructor
    public Shape() {
        length = 0.0;
        width = 0.0;
        height = 0.0;
    }

    // Constructor taking in the Data into the instance variables
    public Shape(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}
