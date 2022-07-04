import org.w3c.dom.ls.LSOutput;

public class SquareDigit {

    public int squareDigits(int n) {
        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        String result = "";

        for (char digit : digits) {
            String strDigit = "" + digit;
            result += Integer.parseInt(strDigit) * Integer.parseInt(strDigit);
        }

        return Integer.parseInt(result);
    }
}
