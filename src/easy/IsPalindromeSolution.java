package easy;
/*
Для заданного целого числа x верните true, если x является палиндромом, и false в противном случае.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class IsPalindromeSolution {
    static public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        StringBuilder reverse = new StringBuilder(str).reverse();
        if (str.equals(reverse.toString())) {
            return true;
        }
        return false;
    }

    static public boolean isPalindromeSolutionTwo(int x) {
        if (x < 0) return false;

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        return original == reversed;
    }
}

