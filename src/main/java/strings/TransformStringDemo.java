package strings;

public class TransformStringDemo {

    public static void main(String[] args) {

        String lotteryWin = " 100 usd ";
        String finalResult = lotteryWin
                .replaceAll("[a-z]", "")
                .strip()
                .transform(TransformStringDemo::formatNumber)
                .toUpperCase();
        System.out.println(finalResult);
    }

    private static String formatNumber(String num) {
        return "You've won " + num;
    }

}
