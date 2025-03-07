package strings;

import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinStringsDemo {

    public static void main(String[] args) {
        String delimiter = ";";
        String[] strings = {"11", "12", null, "13", "14", "15", "16", "17"};
        System.out.println(joinWithStream(delimiter, strings));
        System.out.println(joinWithJoiner(delimiter, strings));
        System.out.println(joinSimplest(delimiter, strings));

    }

    private static String joinWithStream(String delimiter, String[] strings) {
        return Stream.of(strings)
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining(delimiter));
    }

    private static String joinWithJoiner(String delimiter, String[] strings) {
        var joiner = new StringJoiner(delimiter, "{", "}");
        for(String arg: strings) {
            joiner.add(arg);
        }
        return joiner.toString();
    }

    private static String joinSimplest(String delimiter, String[] strings) {
        return String.join(delimiter, strings);
    }

}
