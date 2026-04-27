public class selection_sort {
    public static void main(String[] args) {
        int[] array={13,46,24,52,20,9};
        int n=array.length;
        for(int i=0;i<=n-2;i++){
            int mini=i;
            for(int j=i;j<=n-1;j++){
                if(array[j]<array[mini]){
                    mini=j;

                }
                int temp=array[i];
                array[i]=array[mini];
                array[mini]=temp;
            }
        }
        
        System.out.println("After sorting:");
        for(int num: array){
            System.out.println(num);
        }
    }
}
