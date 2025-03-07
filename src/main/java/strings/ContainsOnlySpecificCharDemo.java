package strings;

import java.util.function.IntPredicate;

public class ContainsOnlySpecificCharDemo {

    private static final String ONLY_DIGITS = "123";
    private static final String NOT_ONLY_DIGITS = "123A";
    private static final String ONLY_LETTERS = "ABC";
    private static final String NOT_ONLY_LETTERS = "ABC1";

    public static void main(String[] args) {
        IntPredicate isDigit = Character::isDigit;
        IntPredicate isLetter = Character::isLetter;
        IntPredicate isLetterOrDigit = Character::isLetterOrDigit;

        System.out.println(containsOnlyCharacter(NOT_ONLY_LETTERS, isLetterOrDigit));
    }

    public static boolean containsOnlyCharacter(String str, IntPredicate predicate) {
        return str.chars().allMatch(predicate);
    }


}
