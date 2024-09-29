abstract class Shape {
    protected int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void printArea() {
        int area = x * y;
        System.out.println("Rectangle area: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void printArea() {
        int area = (x * y) / 2;
        System.out.println("Triangle area: " + area);
    }
}

class Circle extends Shape {
    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    public void printArea() {
        double area = Math.PI * x * x;
        System.out.println("Circle area: " + area);
    }
}

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape triangle = new Triangle(6, 8);
        Shape circle = new Circle(4, 0);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
