import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String [] args){

    }

    public static List<String> allToUpperCase(List<String> words) {
        return words.stream()
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
    }
}
