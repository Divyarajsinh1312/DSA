package Searching;

/**
 * linearSearch
 */
public class linearSearch {
    public static int search(int num[], int key){
        for (int i = 0; i < num.length; i++) {
            if (num[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        int key = 2;
        int index = search(numbers, key);
        if (index == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Key is found at " + index);
        }
    }
}