import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        // method 1
        // String a = String.valueOf(x);
        // StringBuilder b = new StringBuilder(a);
        // String reversed = b.reverse().toString();

        // return a.equals(reversed);

        // method 2
        // if (x < 0) {
        //     return false;
        // }

        // long reversed = 0;
        // long temp = x;

        // while (temp != 0) {
        //     int digit = (int) (temp % 10);
        //     reversed = reversed * 10 + digit;
        //     temp /= 10;
        // }

        // return (reversed == x);

        // method 3
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return (x == reversed) || (x == reversed / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println(isPalindrome(x));
    }
}
