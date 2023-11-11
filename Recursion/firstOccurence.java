package Recursion;

public class firstOccurence {
    public static void main(String[] args) {
        int arr[] = {1,5,6,7,9,5,0};
        System.out.println(FO(arr, 9, 0));
    }
    static int FO(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FO(arr, key, i+1);
    }
}
