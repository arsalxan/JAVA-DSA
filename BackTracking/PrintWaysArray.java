import java.util.ArrayList;

public class PrintWaysArray {
    // program to print total ways one can go from one top to bottom of a maze(or start ot end)

    public static ArrayList<String> totalWays(String ans,int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list= new ArrayList<>();
            list.add(ans);
            return list;
        }
         ArrayList<String> list= new ArrayList<>();
        //  we can add diagonal path as well
         if(r>1 && c>1){
            list.addAll(totalWays(ans+"Di",r-1,c-1));
         }
        if(r>1){
            list.addAll(totalWays(ans+"Rig", r-1, c));
        }
        if(c>1){
            list.addAll(totalWays(ans+"Dow", r, c-1));
        }
        return list;
    }
     public static void totalWaysWithBLock(boolean[][] maze,String ans,int r, int c){
        if(maze.length-1==r && c==maze[0].length-1){
          
            System.out.println(ans);
            return;
            
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            totalWaysWithBLock(maze,ans+"Rig", r+1, c);
        }
        if(c<maze[0].length-1){
            totalWaysWithBLock(maze,ans+"Dow", r, c+1);
        }
    }
    public static void allPaths(boolean[][] maze,String ans,int r, int c){
          if(maze.length-1==r && c==maze[0].length-1){
          
            System.out.println(ans);
            return;
            
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false; // mark as visited
        if(r>0){
            allPaths(maze, ans+"U", r-1, c);
        }
        if(c>0){
            allPaths(maze, ans+"L", r, c-1);
        }
        if(r<maze.length-1){
            allPaths(maze,ans+"R", r+1, c);
        }
        if(c<maze[0].length-1){
            allPaths(maze,ans+"D", r, c+1);
        }
        maze[r][c]=true; // unmark as visited
       
    }
    
    public static void main(String[] args){
        // ArrayList<String> list= new ArrayList<>();
        // list=totalWays("",3,3);
        // System.out.println(list);
        // boolean[][] board={
        //     {true,true,true},{true,false,true},{true,true,true}
        // };
        // totalWaysWithBLock(board, "", 0, 0);
        boolean[][] board={
            {true,true,true},{true,true,true},{true,true,true},
        };
        // allPaths(board, "", 0, 0);
        // System.out.println("Total ways: "+list.size());
        // System.out.println("Total ways: "+totalWays("",3,3).size());
        // System.out.println("Total ways: "+totalWaysWithBLock(board, "", 0, 0).size());
        System.out.println("Total ways: ");
        allPaths(board, "", 0, 0);
    }
} 

