class Manager {
    protected String name;

    Manager(String mname) {
        this.name = mname;

    }

    void display() {
        System.out.println(" manager name: " + name);
    }
}

class Employee extends Manager {
    private String name;

    Employee(String mname, String ename) {
        super(mname);
        this.name = ename;

    }

    @Override
   public void display() {
        System.out.println(" manager name: " + name+" "+"  employee name: "+name);
    }
}

public class P17 {
    public static void main(String[] args) {
        Manager m = new Employee("paras", "neelam");
        m.display();
    }
}
