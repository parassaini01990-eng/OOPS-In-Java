abstract class Vehicle {
    abstract void accelerate();// abstract method

    abstract void brake();// abstract method
}

class Car extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("accelerate perform by car");
    }

    @Override
    public void brake() {
        System.out.println("brake perform by car");
    }
}

class Bus extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("accelerate perform by bus");
    }

    @Override
    public void brake() {
        System.out.println("brake perform by bus");
    }
}

public class P12 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bus();

        v1.accelerate();
        v1.brake();

        v2.accelerate();
        v2.brake();
    }
}
