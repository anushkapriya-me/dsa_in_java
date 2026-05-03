public class check_sorted {
    public static void main(String[] args) {
        int[] arr = {32,34,21,35,54};
        boolean isSorted = true;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i+1] < arr[i]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}