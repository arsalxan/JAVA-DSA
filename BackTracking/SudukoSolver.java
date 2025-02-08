public class SudukoSolver {
    public static boolean isSafe(int mat[][], int row, int col, int digit) {
        for (int i = 0; i < 9; i++) {
            if(mat[i][col]==digit){
                return false;
            }
        }
        for(int j=0;j<9;j++){
            if(mat[row][j]==digit){
                return false;
            }  
        }
        int sr=(row/3)*3,
         sc= (col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(mat[i][j]==digit){
                    return false;
                }
                
            }
           
        }
        return true;
    }

    public static boolean Solve(int suduko[][], int row, int col) {
        if (row == 9) {
            return true;
        }
        int newRow = row, newCol = col + 1;
        if (col+1 == 9) {
            newRow = row + 1;
            newCol = 0;
        }
        if (suduko[row][col] != 0) {
            return Solve(suduko, newRow, newCol);
        }
        for (int digit = 1; digit < 10; digit++) {
            if (isSafe(suduko, row, col, digit)) {
                suduko[row][col] = digit;
                if (Solve(suduko, newRow, newCol)) {
                    return true;
                }
                suduko[row][col] = 0;
            }
        }

        return false;
    }

    public static void printBoard(int[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int d = 0; d < 9; d++) {
                System.out.print(board[r][d] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Example Sudoku puzzle (0 represents empty cells)
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(Solve(board, 0, 0)){
            printBoard(board);
        }
        else{
            System.out.println("Can't Solve");
        }
    }
}
