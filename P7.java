class Student {
    String name;
    int[] marks;

    public void display() {
        System.out.println("Name: " + name);
    }

    int i;

    public void averageMarks() {
        int sum = 0;
        for (i = 0; i < marks.length; i++) {

            sum = sum + marks[i];
        }
        float average = sum / marks.length;
        System.out.println("Average: " + average);

    }

}

public class P7 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "paras";
        s1.marks = new int[] { 70, 80, 90 };
        s1.display();
        s1.averageMarks();

         Student s2= new Student();
        s2.name = "prerna";
        s2.marks = new int[] {70, 90, 70 };
        s2.display();
        s2.averageMarks();
        
         Student s3 = new Student();
        s3.name = "Nisha";
        s3.marks = new int[] { 60, 50, 70 };
        s3.display();
        s3.averageMarks();
    }
}
