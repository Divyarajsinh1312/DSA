/**
 * staircaseSearch
 */
import java.util.*;
public class staircaseSearch {
    public static boolean searchingMatrix(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length-1;
        while (row<matrix.length && col >= 0) {
            if (matrix[row][col]==key) {
                System.out.println("Key is Found at (" + row + "," + col + ")");
                return true;
            }
            else if (key<matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key is not Found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                        {15,25,36,45},
                        {17,29,37,48},
                        {32,33,39,50}};
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Key: ");
        int key = scn.nextInt();
        searchingMatrix(matrix,key);
    }
}