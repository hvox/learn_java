public class StringsDemo {
    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(str1 + " is palindrome: " + isPalindrome(str1));
        String str2 = "heleh";
        System.out.println(str2 + " is palindrome: " + isPalindrome(str2));
        String str3 = "hello, world!!";
        System.out.printf("%s - %s = %s\n", str3, str1, removePrefix(str3, str1));
    }

    static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrefix(String str, String prefix) {
        if (prefix.length() > str.length()) {
            return false;
        }
        int n = prefix.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    static String removePrefix(String str, String prefix) {
        if (!isPrefix(str, prefix)) {
            return str;
        }
        return str.substring(prefix.length());
    }
}
