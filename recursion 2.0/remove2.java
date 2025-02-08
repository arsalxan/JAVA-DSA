public class remove2 {
    public static StringBuilder remove(String str, StringBuilder sb,int idx,boolean map[]){
        if(idx==str.length()){
            return sb;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            return remove(str,sb,idx+1,map);
        }
        map[currChar-'a']=true;
        return remove(str,sb.append(currChar),idx+1,map);
    }
    public static void main(String [] args){
        System.out.print(remove("aaiivvajjg",new StringBuilder(""),0,new boolean[26]));
    }
}
