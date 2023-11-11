package Recursion;

public class lastOccurence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7,8,5};
        System.out.println(LO(arr, 5, 0));
    }
    static int LO(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = LO(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
}
