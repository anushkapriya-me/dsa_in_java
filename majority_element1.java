public class majority_element1 {
    public static void main(String[] args) {
        int[] arr={7,0,01,7,7,2,7,7};
        int ele=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
           
            if(arr[i]==ele){
                count=count+1;
            }
            else{
                count=count-1;
            }

            if(count==0 && arr[i]!=ele){
                arr[i]=ele;
                count+=1;
            }
        }
        System.out.println(ele);
    }
}
