package Sorting;

/**
 * counting
 */
//Time Complexity in some cases linear and some time near to O(n)
//Use for small numbers like student marks etc.
//And also for small range number
public class counting {
    public static void countingSorting(int arr[]){
         int largest = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
         }
         
         int count[] = new int[largest + 1];
         for (int i = 0; i < count.length; i++) {
            count[arr[i]]++;
         }

        //Sorting
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    public static void printArr(int arr[]){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {1,4,1,3,2,4,3,7};
        countingSorting(array);
        printArr(array);
    }
}