import java.util.*;
public class two_sum1 {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int target=14;
        int l=0;
        int r=arr.length-1;
        Arrays.sort(arr);
        while(l<r){
            int sum=arr[l]+arr[r];
                if(sum==target){
                    System.out.println("Yes");
                    return;
                }
                else if(sum<target){
                    l++;
                }
                else{
                    r--;
                }
            }
        System.out.println("NO");
        }
    }

