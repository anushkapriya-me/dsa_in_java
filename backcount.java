import java.util.Scanner;

public class backcount {
    static void func(int i,int n){
        if(n<i){
           return;
        }
        System.out.println(n);
        func(i,n-1);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        func(1,n);
        }
}
