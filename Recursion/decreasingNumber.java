package Recursion;

//Print number in Decreasing order from 10 to 1
public class decreasingNumber {

    static void printNumber(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        //Tail Recursion
        printNumber(n-1);
    }
    public static void main(String[] args) {
        printNumber(10);
    }
}

