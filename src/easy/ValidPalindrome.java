package easy;

public class ValidPalindrome {
        public static boolean isPalindrome(String s) {
        String noWhite = s.replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuilder(noWhite).reverse().toString();
            return noWhite.equalsIgnoreCase(reversed);
        }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        String s = "hello: world";
//        s = s.replaceAll("[^a-zA-Z0-9]", "");
//        String r = new StringBuilder(s).reverse().toString();
//        System.out.println(r);
    }
}
