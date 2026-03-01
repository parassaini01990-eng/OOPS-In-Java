class Car2 {
    String make;
    String model;
    int year;

    Car2(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "car make:" + make + "  model:" + model + "  year= "+year;
    }

}

public class P4 {
    public static void main(String[] args) {
        Car2 c1 = new Car2("Toyota", "Fortuner", 2022);
        Car2 c2 = new Car2("Honda", "City", 2021);
        System.out.println(c1);
        System.out.println(c2);
    }
}