package Recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(PowerOfXOptimized(2, 10));
    }

    // Time Complexity is O(n)
    static int PowerOfX(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * PowerOfX(x, n - 1);
    }

    // Time Complexity is O(logN)
    static int PowerOfXOptimized(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = PowerOfXOptimized(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
}
