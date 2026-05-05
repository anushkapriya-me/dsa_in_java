
public class maximum_ones {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,1,1,1,1,1};
        int count=0;
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count=count+1;
                maxi=Math.max(count,maxi);
            }
            if(arr[i]==0){
                count=0;
            }
        }
        System.out.println(maxi);
    }
}
