import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        Consumer<String> val= x->System.out.println(x);
        val.accept("mike");
    }
}
