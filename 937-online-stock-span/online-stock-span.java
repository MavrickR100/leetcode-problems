class StockSpanner {
    Stack <int[]> stack;
    int count;

    public StockSpanner() {
        stack = new Stack<>();
        count=0;
    }
    
    public int next(int price) {
        count++;
        int[] tem =null;
        int[] t = {price,count};

        if(count == 1){
            stack.push(t);
            return 1;
        }

        while(stack.size() != 0){
            tem = stack.peek();
            if( tem[0] <= price){
            stack.pop();
            if(stack.size()==0){
                tem[0]=0;
                tem[1]=0;
            }
            }else{
                break;
            }
        }
        stack.push(t);
        return count - tem[1];
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */