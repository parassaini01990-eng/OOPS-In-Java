import java.util.List;
import java.util.ArrayList;

import java.util.function.Consumer;

public class Consumer_Functional_Interface {
 public static void main(String[] args) {
    Consumer<String>consume=st->System.out.println(st);
    consume.accept("java");
    List<String>list=new ArrayList(List.of("java","python","C","C++"));
 list.stream().map(st->"paras"+st).forEach(consume);
}
}