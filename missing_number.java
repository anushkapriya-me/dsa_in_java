public class missing_number {
    public static void main(String[] args) {
        int[] arr={8,2,4,5,3,7,1};
        int n=arr.length+1;
        int exSum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int num=exSum-sum;
        System.out.println(num);
    }
}
