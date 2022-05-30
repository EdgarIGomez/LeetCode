package easy;

public class isNumberPalindrome {
    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        String reversed = new StringBuilder(number).reverse().toString();
        return number.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1234));
        System.out.println(isPalindrome(1221));
    }
}

