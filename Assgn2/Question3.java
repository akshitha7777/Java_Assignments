import java.util.*;

public class Question3{
    static void nameTrim(List<String> strings) {
        for (ListIterator<String> name = strings.listIterator(); name.hasNext(); ) {
            name.set(name.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList(" Akshitha ", " Anil ");
        nameTrim(nameList);
        for (String s : nameList) {
            System.out.format("\"%s\"%n", s);
        }
    }
}
