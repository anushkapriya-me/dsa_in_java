//Two pointer approach
import java.util.*;
public class reversearray{
    static void func(int a[] , int l,int r){
        if(l>=r){
            return;
        }
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
        func(a, l+1,r-1);
    }
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        int n= a.length;
        func(a, 0, n-1);

        for(int i:a){
            System.out.println(i);
        }

    }

}