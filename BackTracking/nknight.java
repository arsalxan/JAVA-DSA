public class nknight {
    

    public static  boolean isTrue(char mat[][], int row , int  col){
        if(col-1>=0 && row-2>=0){
            if(mat[row-2][col-1]=='K'){
                return false;
            }
        }
        if(col+1<mat.length && row-2>=0){
            if(mat[row-2][col+1]=='K'){
                return false;
            }
        }
        if(col-2>=0 && row-1>=0){
            if(mat[row-1][col-2]=='K'){
                return false;
            }
        }
        if(col+2<mat.length && row-1>=0){
            if(mat[row-1][col+2]=='K'){
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
            mat[row][j]='K';
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

