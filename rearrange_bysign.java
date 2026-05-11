public class rearrange_bysign{
    public static void main(String[] args) {
        int[] arr= {1,2,-3,1,-2,-3};
        int n=arr.length;
        int[] ans=new int[n];
        int posIndex=0;
        int negIndex=1;
        for(int i=0;i<n;i++){
            if (arr[i]<0){
                ans[negIndex]=arr[i];
                negIndex+=2;
            }
            else{
                ans[posIndex]=arr[i];
                posIndex+=2;
            }
        }
        for(int num: ans){
            System.out.println(num);
        }
    }
}