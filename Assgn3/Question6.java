import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question6 {
 public static void main(String[] args) {
 String str = "Hello world";
 Map<Character, Long> collectString = str.chars()
		 .mapToObj(i -> (char)i)
		 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
 
 Optional<Character> firstRepeat = collectString.entrySet()
 .stream()
 .filter( (e) -> e.getValue() > 1)
 .map(e -> e.getKey()).findFirst();
 
 System.out.println("Repeated Character in string is '" + firstRepeat.orElse(null)+"'");
 }
}
