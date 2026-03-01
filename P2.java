class Rectangle {
    int width;
    int height;

    public void findArea() {
        int area;
        area = width * height;
        System.out.println("Area of Rectangle:" + area);
    }

    public void findPerimeter() {
        int perimeter;
        perimeter = 2 * (width + height);
        System.out.println("Perimeter of Rectangle:" + perimeter);
    }
}

public class P2 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 20;
        r.height = 15;
        r.findArea();
        r.findPerimeter();
    }
}