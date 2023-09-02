package Array;

/**
 * reverse
 */
public class reverse {
    public static void reverseArray(int arr[]){
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
    public static void main(String[] args) {
        int array[] = {2,4,9,1,5,8,6};
        System.out.print("Reverse Array: ");
        reverseArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}