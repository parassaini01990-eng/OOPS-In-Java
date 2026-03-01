import java.util.ArrayList;
import java.util.List;

import java.util.function.Function;

public class Function_Functional_Interface {
    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();
        System.out.println(getLength.apply("Ridyansh"));

        Function<Integer, String> addstr = n -> "paras" + n;
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        list.stream().map(addstr).forEach(n -> System.out.println(n));

        List<String> list2 = new ArrayList<>(List.of("paras", "prerna", "sanchit", "rajesh", "ridyansh"));
        // list2.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        // list2.stream().map(String::toLowerCase).forEach(System.out::println);
        // list2.stream().filter(s->s.startsWith("p")).forEach(s->System.out.println(s));
        list2.stream().sorted().forEach(System.out::println);
        int count = (int) list2.stream().count();
        System.out.println(count);

    }
}