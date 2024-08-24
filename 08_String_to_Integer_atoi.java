class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        boolean digitEncountered = false;
        boolean positive = true;
        boolean zeroEncountered = false;
        boolean symbolEncountered = false; // sign encountered

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 1 - whitespace
            if (ch == ' ') {
                if (!digitEncountered && !zeroEncountered && !symbolEncountered) {
                    continue;
                } else { // whitespace in between 
                    break;
                }
            }

            // 2 - sign
            else if (ch == '-') {
                if (!digitEncountered && !zeroEncountered && !symbolEncountered) {
                    positive = false;
                    symbolEncountered = true;
                } else { // - sign in between
                    break;
                }
            }

            else if (ch == '+') {
                if (!digitEncountered && !zeroEncountered && !symbolEncountered) {
                    symbolEncountered = true;
                } else { // + sign in between
                    break;
                }
            }

            // 3 - skipping 0s
            else if (ch == '0' && !digitEncountered) {
                zeroEncountered = true;
                continue;
            }

            // other cases
            else if (ch == '.') {
                break;
            }

            // 4 - processing digits
            else if (ch >= '0' && ch <= '9') {
                digitEncountered = true;
                int digit = ch - '0';

                // Overflow check before applying the next digit
                if (ans > (Integer.MAX_VALUE - digit) / 10) {
                    return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                ans = ans * 10 + digit;
            }

            // 5 - handle invalid characters
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                break;
            }
        }

        // Apply the negative sign if needed
        if (!positive) {
            ans = -ans;
        }

        return ans;
    }
}
