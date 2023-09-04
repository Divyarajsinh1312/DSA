package Sorting;
/**
 * bubble
 */
public class bubble {
    public static void bubbleSort(int arr[]){
        for (int turn = 0; turn < arr.length-1; turn++) {
            for (int j = 0; j < arr.length-1-turn; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
        int array[] = {5,4,1,3,2};
        bubbleSort(array);
        printArr(array); 
    }
}