public class checkSorted{
    public static int check(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]==false) {
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,10,6,7,8,9};
        int result = check(arr);
        if (result == 1) {
            System.out.println("Array is sorted");
        } else {
            System.err.println("Array is unsorted");
        }
    }
}