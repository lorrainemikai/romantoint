
import java.util.HashMap;
import java.util.Map;



public class romantoint {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanNumerals.get(s.charAt(i));
            if (i < s.length() - 1 && currentValue < romanNumerals.get(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String romanNumeral = "VII";
        int integerValue = romanToInt(romanNumeral);

        System.out.println("The integer value of the Roman numeral " + romanNumeral + " is " + integerValue);
    }
}
