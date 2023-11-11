package Recursion;

/**
 * Tiling
 */
public class Tiling {

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
    static int tilingProblem(int n){ //2xN floor
        if (n == 0 || n == 1) {
            return 1;
        }

        // Vertical Choice
        int vertical = tilingProblem(n-1);

        // Horizontal Choice
        int horizontal = tilingProblem(n-2);

        int totalWays = vertical + horizontal;
        return totalWays;
    }
}