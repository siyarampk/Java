public class PalindromeDemo {
    public static void main(String[] args) {
        String input = "racecar";
        StringBuilder stringBuilder = new StringBuilder(input);
        boolean isPalindrome = input.equals(stringBuilder.reverse().toString());
        System.out.printf("Is the given String %s is a palindrome or not ? : %b%n", input, isPalindrome);
    }
}
