class Solution {
    public String addStrings(String num1, String num2) {
        int iA = num1.length() - 1;
        int iB = num2.length() - 1;

        StringBuilder ansSb = new StringBuilder();

        int carry = 0;

        while (iA >= 0 || iB >= 0 || carry == 1) {
            int sum = carry;
            int d1 = (iA >= 0) ? Integer.parseInt(num1.charAt(iA--) + "") : 0;
            int d2 = (iB >= 0) ? Integer.parseInt(num2.charAt(iB--) + "") : 0;
            sum = sum + d1 + d2;
            carry = sum / 10;
            ansSb.append(sum % 10);
        }

        return ansSb.reverse().toString();
    }
}