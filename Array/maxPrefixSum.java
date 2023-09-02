package Array;

/**
 * maxPrefixSum
 */
public class maxPrefixSum {
    public static int prefixSum(int arr[]){
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        
        //Calculate Prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(sum>max){
                    max = sum;
                }
            }
        }
        
        return max;
    }
    public static void main(String[] args) {
        int array[] = {1,3,-5,1,4 };
        int maxOfSubArray = prefixSum(array);
        System.out.println("Max sum of sub array is " + maxOfSubArray);
    }
}