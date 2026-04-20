import java.util.*;
public class count {
    static void func(int i,int n){
        if (i>n){
            return;
        }
        System.out.println(i);
        func(i+1,n);
    }
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        n=sc.nextInt();
        func(1,n);
    }
}
