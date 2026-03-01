class Counter {
    static int count;

    Counter() {

        count++;
    }

    public  void display() {
        System.out.println(count);
    }

}

public class P9 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
    }
}
