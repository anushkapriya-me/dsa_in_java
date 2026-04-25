//using single pointer
public class palindrome_check {
    static boolean func(String s,int i){
        int n=s.length();
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return func(s,i+1);
    }
    public static void main(String[] args) {
        String s="madam";
        if(func(s, 0)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
