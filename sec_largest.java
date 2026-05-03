public class sec_largest {
    public static void main(String[] args){
        int[] arr = {1,2,4,7,7,5};
        int max = arr[0];
        int smax = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println("Second largest is: " + smax);
    }
}