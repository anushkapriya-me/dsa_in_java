//Single pointer approach
import java.util.*;
public class reverse_array {
    static void func(int[] a,int i){
        int n=a.length;
        if(i>=n/2){
            return;
        }
        int temp= a[i];
        a[i]=a[n-i-1];
        a[n-i-1]=temp;
        func(a, i+1);
    }
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
       
        func(a, 0);
        for(int i:a){
            System.out.println(i);
        }
    }
}
