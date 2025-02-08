public class removerepetition {
    public static void remove(String str, int index ,boolean map[],StringBuilder sb){
        if(index==str.length()){
            System.out.println(sb);
            return;
        }
        char currChar= str.charAt(index);
        if(map[currChar-'a']== true){
            remove(str, index+1, map, sb);
        }
        else{
            map[currChar-'a']=true;
            remove(str, index+1, map, sb.append(currChar));
        }
    }
    public static void  main(String[] args){
        String sr="abaayyyakkaaa";
        remove(sr,0,new boolean[26],new StringBuilder(""));

    }
}
