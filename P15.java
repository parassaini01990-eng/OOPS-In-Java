interface LandVehicle {
    default void landInfo() {// optional to override in child class
        System.out.println("This is land vehicle");
    }

    abstract void humanInfo();//compulsory to override in child class

    static void Info() {// impossible to override in child class
        System.out.println("This is land vehicle");
    }
}

interface WaterVehicle {
    default void waterInfo() {
        System.out.println("This is water vehicle");

    }
}
//subclass implementing both interfaces
class AmphibiviousVehicle implements LandVehicle, WaterVehicle {
    AmphibiviousVehicle() {
        System.out.println("this is  AmphibiviousVehicle");
    }

    @Override
    public void humanInfo() {
        System.out.println("This is humaninfo");

    }

    /*
     * @Override
     * public void landInfo() {
     * System.out.println("This is land vehicle");
     * }
     * 
     * @Override
     * 
     * public void waterInfo() {
     * System.out.println("This is water vehicle");
     * }
     */

}

public class P15 {
    public static void main(String[] args) {
        AmphibiviousVehicle frog = new AmphibiviousVehicle();
        frog.landInfo();
        frog.waterInfo();
        frog.humanInfo();

    }
}
