package numbers;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormattingDoubles {
    public static void main(String[] args) {

        double myDouble = 1245.9834d;

        NumberFormat numberFormatter = new DecimalFormat("#.00");
        System.out.println("Plain Decimal Format: " + numberFormatter.format(myDouble));

        NumberFormat numberFormatter2 = new DecimalFormat("00,000.0000000");
        System.out.println("Plain Decimal Format: " + numberFormatter2.format(myDouble));
    }
}
