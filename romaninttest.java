   import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class romantointtest {

    @Test
    public void testRomanToInt() {
        // Test cases for valid Roman numerals
        assertEquals(7, RomanToInt.romanToInt("VII"));
        assertEquals(58, RomanToInt.romanToInt("LVIII"));
        assertEquals(1994, RomanToInt.romanToInt("MCMXCIV"));

        // Test cases for invalid Roman numerals
        assertEquals(0, RomanToInt.romanToInt("IIII")); // Invalid repetition of I
        assertEquals(0, RomanToInt.romanToInt("VV")); // Invalid repetition of V
        assertEquals(0, RomanToInt.romanToInt("XX")); // Invalid repetition of X
        assertEquals(0, RomanToInt.romanToInt("LL")); // Invalid repetition of L
        assertEquals(0, RomanToInt.romanToInt("CC")); // Invalid repetition of C
        assertEquals(0, RomanToInt.romanToInt("DD")); // Invalid repetition of D
        assertEquals(0, RomanToInt.romanToInt("MM")); // Invalid repetition of M
        assertEquals(0, RomanToInt.romanToInt("IV")); // Invalid subtraction of I before V
        assertEquals(0, RomanToInt.romanToInt("IX")); // Invalid subtraction of I before X
        assertEquals(0, RomanToInt.romanToInt("XL")); // Invalid subtraction of X before L
        assertEquals(0, RomanToInt.romanToInt("XC")); // Invalid subtraction of X before C
        assertEquals(0, RomanToInt.romanToInt("CD")); // Invalid subtraction of C before D
        assertEquals(0, RomanToInt.romanToInt("CM")); // Invalid subtraction of C before M
    }
    
}

}
