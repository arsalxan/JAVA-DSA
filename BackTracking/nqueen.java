

public class nqueen {
    public static  boolean isTrue(char mat[][], int row , int  col){
        for(int i=row-1;i>=0;i--){
            if(mat[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(mat[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<mat.length;i--,j++){
            if(mat[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    public static void printQueen(char mat[][], int row) {
        if (row == mat.length) {
            print(mat);
            return;
        }
        for(int j=0;j<mat.length;j++){
            if(isTrue(mat,row,j)){
            mat[row][j]='Q';
            printQueen(mat,row+1);
            mat[row][j]='*';
        }
    }
    }
    public static void print(char mat[][]){
        System.out.println("++++++++++++++++");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.printf("%c ", mat[i][j]);
            }
            System.err.println();
        } 
    }

    public static void main(String[] args) {
        int n=4;
        char mat[][]= new char[n][n];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<n;j++){
                mat[i][j]='*';
            }
        }
        printQueen(mat, 0);
    }
}

