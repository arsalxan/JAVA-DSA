// program to print total ways one can go from one top to bottom of a maze(or start ot end)
public class PrintWays {
    static int i=1;
    public static void totalWays(String ans,int r, int c){
        if(r==1 && c==1){
            System.out.println(i+++" "+ans);
            return;
        }
        if(r>1){
            totalWays(ans+"R", r-1, c);
        }
        if(c>1){
            totalWays(ans+"D", r, c-1);
        }
    }
    public static void main(String[] args){
        totalWays("",3,3);
    }
} 
