public class diagonalsum {
    public static int dsum(int mat[][]){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j ){
                    sum+=mat[i][j];
                }
                else if((i+j)==mat.length-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
        {5,6,7},
        {9,10,11},
        };
        System.out.println(dsum(arr));
    }
}