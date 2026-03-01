class Employee2 {
    String name;
    int id;
    double salary;
    static int counter = 0;//   static->share with all object

    Employee2(String name, double salary) {
        counter++;
        this.id = counter;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + " " + " Employee Id: " + id + " " + " Salary: " + salary;
    }

}

public class P11 {
    public static void main(String[] args) {
        Employee2 e2 = new Employee2("paras", 5000000.897);
        Employee2 e3 = new Employee2("neelam", 6000000.987);
        Employee2 e4 = new Employee2("prerna", 7000000.677);

        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
    }
}