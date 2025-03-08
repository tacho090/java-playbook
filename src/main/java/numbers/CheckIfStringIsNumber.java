package numbers;

public class CheckIfStringIsNumber {
    public static void main(String[] args) {
        System.out.println(isNumericLoop("5"));
        System.out.println(isNumericLoop("5a"));

        System.out.println(isNumericTryCatch("5a"));
        System.out.println(isNumericTryCatch("-5"));
        System.out.println(isNumericTryCatch("5.5"));
        System.out.println(isNumericTryCatch("3.30e23"));
        System.out.println(isNumericTryCatch("3.3f"));
        System.out.println(isNumericTryCatch("5,5"));
    }

    private static boolean isNumericLoop(String str) {
        for (char c: str.toCharArray()) {
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    public static boolean isNumericTryCatch(String str) {
        try{
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
