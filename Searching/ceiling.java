//Ceiling of a Number
//Kunal Kushwaha
package Searching;
import java.util.*;
/**
 * ceiling
 */
public class ceiling {
    public static void ceilingNumber(int number[], int key){
        int low = 0;
        int high = number.length-1;
        int mid = 0;
        while (low<=high) {
            mid = (low+high)/2;
            if(number[mid]==key){
                System.out.println("Key is found");
                int ceiling = key;
                System.out.println("Ceiling of the number is " + ceiling);
                return;
            }
            else if(number[mid]<key){
                low = mid + 1;
            }
            else if(number[mid]>key){
                high = mid - 1; 
            }
        }
        System.out.println("key is not found");
        if(key<number[high]){
            int ceiling = number[mid + 1];
            System.out.println("Ceiling of the number is " + ceiling);
        }
    }
    public static void main(String[] args) {
        int number[] = {2,3,5,9,14,16,18};
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Key: ");
        int key = scn.nextInt();
        ceilingNumber(number, key);
    }
}