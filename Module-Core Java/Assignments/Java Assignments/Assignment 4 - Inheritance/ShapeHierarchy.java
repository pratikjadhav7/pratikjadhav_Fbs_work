
class Shape {

    double area;

    public Shape() {
        this.area = 00;
    }

    public Shape(double area) {
        this.area = area;
    }

    void setArea(double area) {
        this.area = area;
    }

    double getArea() {
        return this.area;
    }

    void display() {
        System.out.println("Area: " + this.area);
    }
}

class Circle extends Shape {

    double radius;

    public Circle() {
        super();
        this.radius = 00;
    }

    public Circle(double radius, double area) {
        super(area);
        this.radius = radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void display() {
        super.display();
        System.out.println("Radius: " + radius);
    }
}

class Rectangle extends Shape {

    double length, breadth;

    public Rectangle() {
        super();
        this.length = 00;
        this.breadth = 00;
    }

    public Rectangle(double area, double length, double breadth) {
        super(area);
        this.length = length;
        this.breadth = breadth;
    }

    void setLength(double length) {
        this.length = length;
    }

    void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    double getLength() {
        return this.length;
    }

    double getBreadth() {
        return this.breadth;
    }

    void display() {
        super.display();
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

}

class Triangle extends Shape {

    double base, height;

    public Triangle() {
        super();
        this.base = 00;
        this.height = 00;
    }

    public Triangle(double area, double base, double height) {
        super(area);
        this.base = base;
        this.height = height;
    }

    void setBase(double base) {
        this.base = base;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getBase() {
        return this.base;
    }

    double getHeight() {
        return this.height;
    }

    void display() {
        super.display();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
    }

}

public class ShapeHierarchy {

    public static void main(String[] args) {

        Circle c = new Circle(4, 5.10);
        c.display();

        System.out.println(".()");

        Triangle t = new Triangle(23, 4.5, 2.3);
        t.display();

        System.out.println(".()");

        Rectangle r = new Rectangle(30, 3.7, 7.8);
        r.display();

    }
}
