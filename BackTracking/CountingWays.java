// total ways of going from starting to end in a maze(matrix)
public class CountingWays {
    public static int totalWays(int r,int c){
        //once we have reached the second last index in the maze we can only go one more step
        if(r==1 || c==1){
            return 1;
        }
        // we will go left
        int left=totalWays(r-1, c);
        // we will go right
        int right= totalWays(c-1,r);
        //toatal ways
        return left+right;
    }
    public static void main(String[] args) {
        //three row theree column
        System.out.println(totalWays(3,3));
    }
}
