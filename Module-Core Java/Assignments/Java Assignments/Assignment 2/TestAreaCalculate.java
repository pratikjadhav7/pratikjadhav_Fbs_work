class Shape {
    void calculateArea(Triangle t) {
        double area = 0.5 * t.base * t.height;
        System.out.println("Area of Triangle: " + area);
    }

    void calculateArea(Rectangle r) {
        double area = r.length * r.breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    void calculateArea(Circle c) {
        double area = Math.PI * c.radius * c.radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Triangle {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}

class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
}

public class TestAreaCalculate {
    public static void main(String[] args) {
        Shape s = new Shape();

        Triangle t = new Triangle(10, 5);
        Rectangle r = new Rectangle(4, 6);
        Circle c = new Circle(7);

        s.calculateArea(t);
        s.calculateArea(r);
        s.calculateArea(c);
    }
}