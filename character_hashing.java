import java.util.*;
public class character_hashing {
    public static void main(String[] args) {
        String s = "abcdabefc";
        int[] hash=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            char c=sc.next().charAt(0);
            System.out.println(hash[c-'a']);
        }
    }
}
