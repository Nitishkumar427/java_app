interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        System.out.println("Area of Circle = " + c.area());
    }
}

