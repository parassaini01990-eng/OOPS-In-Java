class Employee_2 {
    String name;
    int id;
    double salary;

    public void disp() {
        System.out.println("name:" + name + " " + "id:" + id);
    }

    public double updateSal(double percent) {
        double raisedsalary = salary * percent/100;
        double updatedsalary = salary + raisedsalary;
        return updatedsalary;
    }
}

public class P3 {

    public static void main(String[] args) {
        Employee_2 emp2 = new Employee_2();
        emp2.id = 1001;
        emp2.name = "Paras";
        emp2.salary = 500000.920;
        emp2.disp();
        
        double inc = emp2.updateSal(10.5);
        System.out.println("Updated Salary:" + inc);

    }
}