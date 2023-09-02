package Array;
/**
 * sumSubArray
 */
public class sumSubArray {
    public static void sum(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print("\nSum of subarray is " + sum);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        sum(array);
    }
}