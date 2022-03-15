public class StringsDemo {
    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(str1 + " is palindrome: " + isPalindrome(str1));
        String str2 = "heleh";
        System.out.println(str2 + " is palindrome: " + isPalindrome(str2));
    }

    static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++)
            if (str.charAt(i) != str.charAt(n - i - 1))
                return false;
        return true;
    }
}
