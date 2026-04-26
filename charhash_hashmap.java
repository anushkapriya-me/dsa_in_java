import java.util.*;
public class charhash_hashmap {
    public static void main(String[] args) {
        String s="abacbaz";
        HashMap<Character,Integer> map= new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map.get('z'));
    }
}
