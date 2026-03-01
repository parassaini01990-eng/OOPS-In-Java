class Book {
    String title;

    public void setTitle(String title) {
        this.title = title;
        System.out.println("Title: " + this.title);
    }
}

public class P8 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        b1.setTitle("Computer Science");
        b2.setTitle("Science");

    }
}
