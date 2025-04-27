import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question3FirstUniqueWord {
    public static void main(String[] args) {
        //Find first non-repeating word
        String input = "Java is fun and Java is powerful";

        Optional<String> result = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst();/*
                .collect(Collectors.toList())
                .get(0));*/
        System.out.println(result.get());
    }
}
