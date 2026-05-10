public class stock_buysell {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<min){
                min=prices[i];
                
            }
            profit=Math.max(prices[i]-min,profit);
            
        }
        System.out.println(profit);
        
    }
}
