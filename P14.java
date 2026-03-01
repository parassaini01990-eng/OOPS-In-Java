interface Shape2 {
    double calculateArea();// public+abstract by default

}
class Circle2 implements Shape2 {
    double radius;

    // constructor of child class
    Circle2(double r) {
        this.radius = r;
    }

    // implement abstract method in subclass
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class P14 {
    public static void main(String[] args) {
        Circle2 c = new Circle2(7.5);
        System.out.println(c.calculateArea());
    }
}