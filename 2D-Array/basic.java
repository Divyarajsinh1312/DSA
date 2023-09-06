import java.util.*;
/**
 * basic
 */
public class basic {
    public static void search(int matrices[][], int key){
        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[0].length; j++) {
                if (matrices[i][j]==key) {
                    System.out.println("Key is found");
                    return;
                }
            }
        }
        System.out.println("Key is not found");
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        int matrix[][] = new int[n][m];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Matrix Element: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        System.out.println("Output: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nEnter key for search: ");
        int key = scn.nextInt();
        search(matrix, key);
    }    
}