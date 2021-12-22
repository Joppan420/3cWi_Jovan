package at.ran.StringHelper;

public class StringHelper {
    public static void main(String[] args) {

        String original = "nurses run";
        original = original.replace(" ", "");

        String reverse = "";
        for(int i = original.length() - 1; i >= 0; i--){
            reverse += original.charAt(i);
            System.out.println(reverse);
        }

        boolean palindrome = true;
        for (int i = 0; i < original.length(); i++) {
            if(original.charAt(i) != reverse. charAt(i)) {
                palindrome = false;
            }
        }

        if(palindrome) {
            System.out.println("PALINDROME!");
        }else {
            System.out.println("Not a palindrome!");
        }
    }
    public static int countLetters(String text,char c) {
        char[] textToCharArr = text.toCharArray();
        int timesLetterIsUsed = 0;
        for (int i = 0; i < textToCharArr.length; i++) {
            if(textToCharArr[i] == c) {
                timesLetterIsUsed++;
            }
        }
        System.out.println("Der Buchstabe " + c + " wird " + timesLetterIsUsed + " mal benutzt.");
        return timesLetterIsUsed;
    }

    public static String reverseString(String text){
        char[] justTheInputArr = text.toCharArray();
        char[] reverseTextArr = new char[text.length()];

        for (int i = 1; i <= justTheInputArr.length; i++) {
            reverseTextArr[text.length()-i] = justTheInputArr[i-1];
            System.out.println(reverseTextArr);
        }
        return reverseTextArr.toString();
    }

    public static int printAmountOfLetters(String text){
        char[] textToCharArr = text.toCharArray();
        int lenghtOfString = 0;
        for (int i = 0; i < textToCharArr.length; i++) {
            lenghtOfString++;
        }
        System.out.println("Der Text ist " + lenghtOfString + " Zeichen lang");
        return lenghtOfString;
    }

}


