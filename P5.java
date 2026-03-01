class Student {
    private String stuName;
    private String schName;

    public Student() {
        stuName = "";
        schName = "DPS";
    }

    //public void display() {
      //  System.out.println("studentname:" + stuName + " " + "schoolname:" + schName);
   // }
@Override
    public String toString() {
        return "studentname:"+stuName + " studentschool:" + schName;
    }
}

public class P5 {
    public static void main(String[] args) {
        Student s = new Student();
       // s.display();
        System.out.println(s);//s.toString() call internally
    }
}
