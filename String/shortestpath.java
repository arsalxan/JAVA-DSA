// to find the shortest path
public class shortestpath {
    public static double spath(String name){
        int x, y;
        x=y=0;
        for(int i=0; i<name.length();i++){
            switch(name.charAt(i)){
                case 'E':x++; break;
                case 'W':x--; break;
                case 'N':y++; break;
                case 'S':y--; break;
                
            }
        }
        return Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String path="NOSE";
        System.out.println(spath(path));
    }
}
