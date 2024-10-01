/**
 * spiral
 */
public class spiral {
    public static void spiralPrint(int matrix[][]){
        int startRow = 0, endRow = matrix.length-1;
        int startCol = 0, endCol = matrix[0].length-1;
        while (startRow<=endRow && startCol<=endCol) {
            //Top
            for (int i = startRow; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            //Right
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            //Bottom
            for (int i = endCol-1; i >= startCol; i--) {
                if (startRow==endCol) {
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }
            //Left
            for (int i = endRow-1; i >= startRow+1; i--) {
                if (startCol==endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        spiralPrint(matrix);
    }
}