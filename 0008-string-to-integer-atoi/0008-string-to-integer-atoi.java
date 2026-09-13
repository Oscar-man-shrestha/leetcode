class Solution {

    static final long INT_MIN_VAL = -2147483648L;
    static final long INT_MAX_VAL = 2147483647L;

    public int check(String s, int i, int sign, long num) {

        // Base case
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return (int)(sign * num);
        }

        // Convert character to digit
        int digit = s.charAt(i) - '0';

        // Build number
        num = num * 10 + digit;

        // Check overflow
        long value = sign * num;

        if (value < INT_MIN_VAL) {
            return (int) INT_MIN_VAL;
        }

        if (value > INT_MAX_VAL) {
            return (int) INT_MAX_VAL;
        }

        // Move to next character
        return check(s, i + 1, sign, num);
    }

    public int myAtoi(String s) {

        int i = 0;
        int sign = 1;

        // Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Check sign
        if (i < s.length() &&
            (s.charAt(i) == '-' || s.charAt(i) == '+')) {

            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        return check(s, i, sign, 0);
    }
}