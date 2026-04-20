import java.util.Scanner;

public class name {
    static void func(int i,int n){
        if (i>n){
            return;
        }
        System.out.println("anu");
        func(i+1,n);
    }
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements:");
        n=sc.nextInt();
        func(1,n);
    }
}
