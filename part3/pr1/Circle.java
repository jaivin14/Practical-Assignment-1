// supporting files for Main

package part3.pr1;

public class Circle extends GeometricObject{
    double radius;

    Circle() {
        this.radius = 10;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.isfilled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 *  getRadius();
    }

    public double getArea() {
        return 3.14 * getRadius() * getRadius();
    }

    public double getPerameter() {
        return 2 * 3.14 * getRadius();
    }
}
