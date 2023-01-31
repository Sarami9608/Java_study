package java0131_ex02;

public class Rectangle extends AreaCalculator {
    private double width, height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double area() {
        return width * height;
    }
}
