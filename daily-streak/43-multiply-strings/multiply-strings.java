class Solution {
    public static String multiply(String num1, String num2) {
        if (num1 == "0" || num2 == "0")
            return "0";
        if (num1 == "1")
            return num2;
        if (num2 == "1")
            return num1;

        int lenNum1 = num1.length();
        int lenNum2 = num2.length();
        StringBuilder ansSb = new StringBuilder("0");

        String mul;
        String mulT;

        if (lenNum1 >= lenNum2) {
            mul = num1;
            mulT = num2;
        } else {
            mul = num2;
            mulT = num1;
        }

        int lenMulT = mulT.length();

        String temp;

        for (int i = lenMulT - 1; i >= 0; i--) {
            temp = multiply(mul, Integer.parseInt(mulT.charAt(i) + ""), lenMulT - i - 1);
            ansSb = add(temp, ansSb.toString());
        }

        return ansSb.toString();
    }

    static String multiply(String mul, int digit, int zeros) {
        if (digit == 0)
            return "0";
        if (digit == 1 && zeros == 0)
            return mul;
        String ansSb="";
        int lenMul = mul.length();

        int car = 0;

        for (int i = lenMul - 1; i >= 0; i--) {
            int ans = Integer.parseInt(mul.charAt(i) + "") * digit + car;
            car = ans / 10;
            ansSb=(ans % 10) + ansSb;
        }

        if (car > 0) {
            ansSb=car + ansSb;
        }

        for (int i = 0; i < zeros; i++) {
            ansSb=ansSb + "0";
        }

        return ansSb;
    }

    static StringBuilder add(String num1, String num2) {
        if (Objects.equals(num1, "0"))
            return new StringBuilder(num2);
        if (Objects.equals(num2, "0"))
            return new StringBuilder(num1);

        int lenNum1 = num1.length() - 1;
        int lenNum2 = num2.length() - 1;

        StringBuilder ansSb = new StringBuilder();
        int car = 0;

        while (lenNum1 >= 0 || lenNum2 >= 0) {
            int d1 = lenNum1 >= 0 ? Integer.parseInt(num1.charAt(lenNum1) + "") : 0;
            int d2 = lenNum2 >= 0 ? Integer.parseInt(num2.charAt(lenNum2) + "") : 0;
            int add = d1 + d2 + car;
            car = add / 10;
            ansSb.insert(0, add % 10);
            lenNum2--;
            lenNum1--;

        }
        if (car == 1) {
            ansSb.insert(0, 1);
        }

        return ansSb;
    }
}