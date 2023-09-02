package Array;

/**
 * subarray
 */
public class subarray {
    public static void subArray(int arr[]){
        int totalSub = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) { //i is start and j is end.
                    System.out.print(arr[k] + " ");
                }
                totalSub++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Array: " + totalSub);
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        subArray(array);
    }
}