abstract class Shape {
  String color;

  abstract double area();
  public abstract String toString();

  Shape(String color) {
    this.color = color;
    System.out.println("Shape constructor called");
  }
}

class Circle extends Shape {
  int radius;

  Circle(String color, int radius) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
 return Math.PI * radius * radius;
  }

  @Override
  public String toString() {
    return color+" "+radius;
  }
}

public class P13 {
  public static void main(String[] args) {
    Shape c = new Circle("red",7);
    System.out.println(c.area());
    System.out.println(c.toString());
  }
}
