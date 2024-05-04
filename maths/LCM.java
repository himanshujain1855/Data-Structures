package gfg.maths;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(12, 14));
        System.out.println(lcm(4, 6));

        System.out.println(lcmA1(12, 14));
        System.out.println(lcmA1(4, 6));
    }

    // Traditional approach
    public static int lcm(int a, int b) {
        int lcm = 1;
        int count = 2;

        while (a != 1 || b != 1) {
            if (a % count == 0 && b % count == 0) {
                lcm *= count;
                a /= count;
                b /= count;
            } else if (a % count == 0) {
                lcm *= count;
                a /= count;
            } else if (b % count == 0) {
                lcm *= count;
                b /= count;
            } else {
                count++;
            }
        }
        return lcm;
    }

    // Traditional approach
    public static int lcmA1(int a, int b) {
        int lcm = Math.max(a, b);

        while (lcm % a != 0 || lcm % b != 0) {
            lcm++;
        }
        return lcm;
    }

    // Another efficient approach
    // so lcm(a,b) * gcd(a,b)=a*b;
    // hence lcm(a,b)=(a*b) / gcm(a,b)

    public static int lcmA2(int a, int b) {
        return (a * b) / GCD.gcdA2(a, b);
    }
}
