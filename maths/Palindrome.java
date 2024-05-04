package gfg.maths;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalinDromeNumberA1(-121));
        System.out.println(isPalinDromeNumberA1(121));
    }

    public static boolean isPalinDromeNumberA1(int num) {
        String copyNum = String.valueOf(num);

        int sI = 0;
        int eI = copyNum.length() - 1;

        while (sI <= eI) {
            if (copyNum.charAt(sI) != copyNum.charAt(eI)) return false;
            sI++;
            eI--;
        }
        return true;
    }

    public static boolean isPalinDromeNumberA2(int num) {
        String copyNum = String.valueOf(num);

        int sI = 0;
        int eI = copyNum.length() - 1;

        while (sI < eI) {
            if (copyNum.charAt(sI) != copyNum.charAt(eI)) return false;
            sI++;
            eI--;
        }
        return true;
    }

    // preferred solution
    public static boolean isPalinDromeNumberA3(int num) {
        int revNum = 0;
        int tempNum = num;
        while (tempNum > 0) {
            revNum = revNum * 10 + tempNum % 10;
            tempNum = tempNum / 10;
        }
        return revNum == num;
    }

}
