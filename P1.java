class Dog {
    String name;
    String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        System.out.println("name:" + this.name + " " + "breed:" + this.breed);

    }

    /*
     * public void printDetails() {
     * System.out.println("name:" + name + " " + "breed:" + breed);
     * }
     */
}

public class P1 {
    public static void main(String[] args) {
        Dog d1 = new Dog("pavlov", "Beagle");
        Dog d2 = new Dog("tommy", "Rootweler");

        // d1.name = "pavlov";
        // d1.breed = "Beagle";
        // d1.printDetails();

        // d2.name = "tommy";
        // d2.breed = "Rootweler";
        // d2.printDetails();

    }
}