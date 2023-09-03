package Array;

/**
 * kadanesAlgo
 */
public class kadanesAlgo {
    //Most optimal solution for Maximum Sub Array Sum.
    //Time Complexity is O(n).
    public static int kadanes(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum<0) {
                sum = 0;
            }
            if (sum>max) {
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        int max = kadanes(array);
        System.out.println("Max of Sub Array Sum is " + max);
    }
}