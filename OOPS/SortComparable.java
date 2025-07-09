import java.util.ArrayList;
import java.util.Comparator;
class Compare implements Comparator<String>{
public int compare(String s1, String s2){
    return s1.compareTo(s2);
}
}

public class SortComparable {
    
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Mango");
        list.add("Orange");
        list.sort(new Compare());
        System.out.println(list);

    }
}
