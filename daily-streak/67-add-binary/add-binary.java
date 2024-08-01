class Solution {
    public static String addBinary(String a, String b) {
        int iA = a.length() - 1;
        int iB = b.length() - 1;

        StringBuilder ansSb = new StringBuilder();

        int carry = 0;

        while (iA >= 0 || iB >= 0) {
            int sum = carry;

            char cA = (iA >= 0) ? a.charAt(iA--) : '0';
            char cB = (iB >= 0) ? b.charAt(iB--) : '0';

            sum = sum + cA - 48 + cB - 48;

            carry = sum >= 2 ? 1 : 0;

            if (sum == 1 || sum == 3) {
                sum = 1;
            } else {
                sum = 0;
            }

            ansSb.insert(0, sum);
        }

        if (carry == 1) return "1" + ansSb;
        return ansSb.toString();
    }

}