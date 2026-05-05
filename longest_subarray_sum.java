public class longest_subarray_sum {
    public static void main(String[] args) {
        int[] arr={10,5,2,7,1,9};
        int k=15;
        int sum=0;
        int l=0;
        int r=0;
        int n=arr.length;
        int maxLen=0;
        while(r<n){
            while(l<=r && sum>k){
                sum=sum-arr[l];
                l++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
            if(r<n){
                sum+=arr[r];
            }
        }
        System.out.println(maxLen);
    }
}
