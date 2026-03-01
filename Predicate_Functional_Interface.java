import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Functional_Interface {
    public static void main(String[] args) {

        /*
         * Predicate<Integer> isEven = n -> n % 2 == 0; //return boolean(true/false)
         * System.out.println(isEven.test(4));//true
         * System.out.println(isEven.test(7));//false
         * 
         * List<Integer> li = new ArrayList<>(List.of(1, 2, 3, 4, 6, 8, 10));
         * li.stream().map(n -> n % 2 == 0).forEach(n
         * ->System.out.println(n));//f,t,f,t,t,t,t
         * li.stream().filter(isEven).forEach(System.out::println);//2,4,6,8,10
         * 
         * 
         */

        Predicate<String> isEmpty = str -> str.isEmpty(); // return boolean(true/false)

        System.out.println(isEmpty.test(""));// true
        System.out.println(isEmpty.test("java"));// false

        List<String> list = new ArrayList<>(List.of("", "java", "", "python"));
        list.stream().filter(isEmpty).forEach(str -> System.out.println(str));

        Predicate<Integer> isEven = (num) -> num % 2 == 0; // return boolean(true/false)
        System.out.println(isEven.test(4));

        List<Integer> li = new ArrayList<>(List.of(2, 32, 13, 4, 5));
        li.stream().filter(num->num%2==0).forEach(num -> System.out.println(num));
        li.stream().map((num) -> (num % 2==0)).forEach(num -> System.out.println(num));


        //List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        //list1.stream().map(n ->n/2).forEach(n-> System.out.println(n));




    }
}
