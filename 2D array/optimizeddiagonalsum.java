public class optimizeddiagonalsum {
    public static int dsum(int mat[][]){
        int n=mat.length,sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            if(i!=n-1-i){
                sum+=mat[i][n-1-i];
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
