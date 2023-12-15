public class Fibonacci {

    public static int sumEvenFibonacci(int limit) {
        int first = 1, second = 2, next = 0, sum = 2;

        while (next <= limit) {
            next = first + second;
            if (next % 2 == 0 && next <= limit) {
                sum += next;
            }
            first = second;
            second = next;
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return number == reverse;
    }
}
