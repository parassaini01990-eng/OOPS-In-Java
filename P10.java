
class Employee {
    private String name;
    private String pl;// pl=programming language

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public void setPl(String pl) {
        this.pl = pl;

    }

    public String getPl() {
        return this.pl;
    }

}

public class P10 {
    public static void main(String[] args) {
        Employee e = new Employee();
        
        e.setName("paras");
        System.out.println(e.getName());

        e.setPl("Java");
        System.out.println(e.getPl());
    }
}