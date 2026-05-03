import java.util.ArrayList;

public class remove_duplicates {

    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3,4,4};
        ArrayList<Integer> list = new ArrayList<>();
        int store=arr[0];
        list.add(store);
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=store){
                store=arr[i];
                list.add(store);
            }

        
        }
            System.out.println(list);
        
    }
}
