package Array;
import java.util.*;
/**
 * largest
 */
public class largest {
    public static int largest(int num[]){
        int largest = Integer.MIN_VALUE; //-Infinity
        for (int i = 1; i < num.length; i++) {
            if (num[i]>largest) {
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,6,78,9,90,12,33,45};
        int max = largest(numbers);
        System.out.println("Largest in this array is " + max);
    }
}