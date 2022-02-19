import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question7 {
 public static void main(String[] args) {
 String str = "Hello world";

 Map<Character, Long> collect = str.chars()
 .mapToObj(i -> (char)i)
 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
 
 Optional<Character> firstNonRepeat = collect.entrySet()
 .stream()
 .filter( (e) -> e.getValue() == 1)
 .map(e -> e.getKey()).findFirst();
 
 System.out.println("First non-repeated character is '" + firstNonRepeat.orElse(null)+"'");
 }
}
