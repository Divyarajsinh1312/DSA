package Searching;
/**
 * smallestLetter
 */
public class smallestLetter {
    public static char smallest(char letters[], char target){
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
            //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        char letter[] = {'c', 'f', 'j'};
        char target = 'z';
        char smallestLetter = smallest(letter, target);
        System.out.println("Answer is " + smallestLetter);
    }
}