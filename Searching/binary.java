package Searching;
import java.util.*;
/**
 * binary
 */
public class binary {
    public static int binarySearching(int array[], int key){
        int low = 0;
        int high = array.length-1;
        while (low<=high) {
            int mid = (low + high)/2;
            if (array[mid]==key) {
                return mid;
            } else if (array[mid]<key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,12};
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Key: ");
        int key = scn.nextInt();
        int result = binarySearching(array, key);
        if (result == -1) {
            System.out.println("Key is not Found");
        } else {
            System.out.println("Key is Found");
        }
    }
}