class Solution {
    public static String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();

        int iA = lenA - 1;

        int iB = lenB - 1;

        char[] charsA = a.toCharArray();

        char[] charsB = b.toCharArray();

        int ansSize = Math.max(lenA, lenB);

        char[] ans = new char[ansSize];

        char carry = '0';

        while (true) {
            if (iA < 0 && iB < 0)
                break;

            char cA = '0';
            char cB = '0';

            if (iA >= 0) {
                cA = charsA[iA];
            }

            if (iB >= 0) {
                cB = charsB[iB];
            }

            char[] temp = eval(cA + "" + cB + carry);
            carry = temp[1];

            ans[Math.max(iA, iB)] = temp[0];

            iA--;
            iB--;
        }

        if (carry == '1')
            return "1" + new String(ans);
        return new String(ans);
    }

    static char[] eval(String s) {
        char[] ans = new char[2];
        ans[0] = '0';
        ans[1] = '0';

        if (s.equals("010") || s.equals("100") || s.equals("001") || s.equals("111")) {
            ans[0] = '1';
        }

        if (s.equals("011") || s.equals("110") || s.equals("101") || s.equals("111")) {
            ans[1] = '1';
        }

        return ans;
    }

}