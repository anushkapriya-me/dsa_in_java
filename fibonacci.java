public class fibonacci {
    static int func (int n){
        if(n<=1){
            return n;
        }
        return func(n-1)+func(n-2);
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(func(n));
    }
}
