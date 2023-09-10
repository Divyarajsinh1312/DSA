package Searching;
import java.util.*;
/**
 * floor
 */
public class floor {
    public static int floorNumber(int array[], int key){
        int start = 0, end = array.length-1;
        if (key<array[start]) {
            return -1;
        }
        while(start <= end) {
            // find the middle element
            //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (key < array[mid]) {
                end = mid - 1;
            } else if (key > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int array[] = {2,3,5,9,14,16,18};
        Scanner scn = new Scanner(System.in);
        int key = scn.nextInt();
        int floor = floorNumber(array, key);
        if (floor == -1) {
            System.out.println("floor of a key is not found");
        } else {
            System.out.println("floor of a key is " + array[floor]);
        }
    }
}
