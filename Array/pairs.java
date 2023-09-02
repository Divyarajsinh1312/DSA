package Array;

/**
 * pairs
 */
public class pairs {
    public static void pairsArray(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        pairsArray(array); 
    }
}