public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            // last digit by mod
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            // last number removed
            number /= 10;
        }
        return originalNumber == reversedNumber;

    }
    public static void main(String[] args) {
        int num=121;
        if (isPalindrome(num)) {
            System.out.println("the number is a palindrome ");
        }
        else{
            System.out.println("the number is not the palindrome ");
        }
    }
}