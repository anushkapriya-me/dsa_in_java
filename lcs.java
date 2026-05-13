import java.util.*;
public class lcs {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,101,1,100,4,102};
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }
        int cnt=0;
        int longest=0;
        for(int j:st){
            if(st.contains(j-1)){
                
            }
        }
    }
}
