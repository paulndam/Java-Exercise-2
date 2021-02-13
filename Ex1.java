import java.util.*;

public class Ex1 {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 9;
        System.out.println(makes10(num1, num2));

        int num3 = 93;
        System.out.println(nearHundred(num3));

        System.out.println(posNeg(1, -1, false));

        System.out.println(notString("candy"));
        System.out.println(notString("not bad"));

        System.out.println(missingChar("kitten", 4));
        System.out.println(missingChar("kitten", 0));
       

    }

    public static boolean makes10(int a, int b) {

        // int num = 10;

        if (a == 10) {
            return true;
        }
        if (b == 10) {
            return true;
        }
        if (a + b == 10) {
            return true;
        } else {
            return false;
        }
    }

    // Given an int n, return true if it is within 10 of 100 or 200. Note:
    // Math.abs(num) computes the absolute value of a number.
    // nearHundred(93) → true
    // nearHundred(90) → true
    // nearHundred(89) → false

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || Math.abs(200 - n) <= 10);

    }

    // Given 2 int values, return true if one is negative and one is positive.
    // Except if the parameter "negative" is true, then return true only if both are
    // negative.
    // posNeg(1, -1, false) → true
    // posNeg(-1, 1, false) → true
    // posNeg(-4, -5, true) → true

    public static boolean posNeg(int a, int b, boolean negative) {

        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (b < 0 && a > 0));
        }

    }

    // Given a string, return a new string where "not " has been added to the front.
    // However, if the string already begins with "not", return the string
    // unchanged. Note: use .equals() to compare 2 strings.
    // notString("candy") → "not candy"
    // notString("x") → "not x"
    // notString("not bad") → "not bad"

    public static String notString(String str) {

        if (str.equals("not")) {
            return str;
        } else {
            return "not" + " " + str;
        }
    }
    // .length() >= 3 && str.substring(0,3)

    // Given a non-empty string and an int n, return a new string where the char at
    // index n has been removed. The value of n will be a valid index of a char in
    // the original string (i.e. n will be in the range 0..str.length()-1
    // inclusive).

    // missingChar("kitten", 1) → "ktten"
    // missingChar("kitten", 0) → "itten"
    // missingChar("kitten", 4) → "kittn"

    public static String missingChar(String str, int n) {

        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());

        return front + back;

    }

}