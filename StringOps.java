public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(capVowelsLowRest("One two tHRee world"));
        System.out.println(camelCase("   Intro to  coMPUter sCIEncE "));

    }

    public static String capVowelsLowRest(String string) {
        String nstring = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            boolean isVowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
            if (!isVowel) {
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 32);
                }
            } else {
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);
                }
            }
            nstring += ch;
        }
        return nstring;
    }

    // write a function that takes a string, turns the first word to lowercase, and
    // the first letter of each word after that to uppercase. delete all spaces.
    public static String camelCase(String string) {
        String result = "";
        boolean nextCharUpper = false;
        boolean isFirstWord = true;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == ' ') {
                nextCharUpper = true;
                isFirstWord = false;
            } else {
                if (nextCharUpper || (isFirstWord && i == 0)) {
                    if (c >= 'a' && c <= 'z') {
                        c = (char) (c - 32);
                    }
                    nextCharUpper = false;
                } else {
                    if (c >= 'A' && c <= 'Z') {
                        c = (char) (c + 32);
                    }
                }
                if (isFirstWord) {
                    if (c >= 'A' && c <= 'Z') {
                        c = (char) (c + 32);
                    }
                }
                result += c;
            }
        }

        if (!result.isEmpty() && result.charAt(0) >= 'A' && result.charAt(0) <= 'Z') {
            result = (char) (result.charAt(0) + 32) + result.substring(1);
        }

        return result;
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
