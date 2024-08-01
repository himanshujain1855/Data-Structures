class Solution {
    public static String addBinary(String a, String b) {
        int iA = a.length() - 1;
        int iB = b.length() - 1;

        StringBuilder ansSb=new StringBuilder();

        char carry = '0';
        
        while (iA >= 0 || iB >= 0) {

            char cA = (iA >= 0) ? a.charAt(iA) : '0';
            char cB = (iB >= 0) ? b.charAt(iB) : '0';

            char[] temp = eval(cA + "" + cB + carry);
            carry = temp[1];
            ansSb.insert(0,temp[0]);

            iA--;
            iB--;
        }

        if (carry == '1') return "1" + ansSb;
        return ansSb.toString();
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