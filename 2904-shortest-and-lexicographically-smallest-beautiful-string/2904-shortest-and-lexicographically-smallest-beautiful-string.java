class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int ones = 0;
        int bestLeft = -1;
        int bestLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) == '1') {
                ones++;
            }

            while (ones > k) {
                if (s.charAt(left) == '1') {
                    ones--;
                }
                left++;
            }

            if (ones == k) {

                while (s.charAt(left) == '0') {
                    left++;
                }

                int len = right - left + 1;

                if (len < bestLen) {
                    bestLen = len;
                    bestLeft = left;
                } else if (len == bestLen) {
                    boolean smaller = false;

                    for (int x = 0; x < len; x++) {
                        if (s.charAt(left + x) != s.charAt(bestLeft + x)) {
                            smaller = s.charAt(left + x) < s.charAt(bestLeft + x);
                            break;
                        }
                    }

                    if (smaller) {
                        bestLeft = left;
                    }
                }
            }
        }

        return bestLeft == -1 ? "" : s.substring(bestLeft, bestLeft + bestLen);
    }
}