package strings;

public class IterateOverCharactersDemo {

    public static void main(String[] args) {
        String str = "some string";
        char charToUpper = 'o';
        System.out.println(chatToUppercase(str, charToUpper));
    }

    private static String chatToUppercase(String str, char charToUpper) {
        var stringBuilder = new StringBuilder();
        for(char character : str.toCharArray()) {
            char charToAppend = character == charToUpper ? Character.toUpperCase(character) : character;
            stringBuilder.append(charToAppend);
        }
        return stringBuilder.toString();
    }
}
