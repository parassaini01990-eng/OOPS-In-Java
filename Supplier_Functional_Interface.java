import java.util.function.Supplier;

public class Supplier_Functional_Interface {
   public static void main(String[] args) {
    Supplier<String>supplier=()->"paras";
    System.out.println(supplier.get());
   } 
}
