/**
 * diagonalSum
 */
public class diagonalSum {
    public static void sum(int matrix[][]){
        int sum = 0;
        //This is Brute Force Solution with Time Complexity O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        //Optimal Solution is O(n)
        for (int i = 0; i < matrix.length; i++) {
            //Primary Diagonal Solution
            sum += matrix[i][i];
            //Secondry Diagonal Solution
            if (i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-i-1];
            }
        }
        System.out.println("Diagoanl Sum: " + sum);
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        sum(matrix);
    }
}