import java.util.*;
public class two_sum2 {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int target=14;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compli=target-arr[i];
            if(map.containsKey(compli)){
                System.out.println("[" + map.get(compli) + "," + i + "]");
                return;
            }
            map.put(arr[i],i);
        }
        System.out.println("[-1,-1]");
    }
}
