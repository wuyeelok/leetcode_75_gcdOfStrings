package kenneth;

/**
 * Main class for defining the required function(s).
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public String gcdOfStrings(String str1, String str2) {

        if (str1.equals(str2)) {
            // both are equals return str1 because either one is gcd
            return str1;
        } else if (str1.length() < str2.length()) {
            // need to make sure str1 length greater than or equal to str2
            return gcdOfStrings(str2, str1);
        } else if (!str1.startsWith(str2)) {
            // not possible of have gcd if not str2 is not prefix
            return "";
        } else {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }

}
