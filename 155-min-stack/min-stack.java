class Pair<T,Y>{
    private T first;
    private Y second;


    public T getFirst(){
        return first;
    }

    public Y getSecond(){
        return second;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public void setSecond(Y second){
        this.second = second;
    }

}
class MinStack {

    Stack<Pair<Integer,Integer>> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        Pair<Integer, Integer> pair = new Pair();
        if(stack.size() == 0){
            pair.setFirst(val);
            pair.setSecond(val);
            stack.push(pair);
        }else{
            if(stack.peek().getSecond() < val){
                pair.setFirst(val);
                pair.setSecond(stack.peek().getSecond());
                stack.push(pair);
            }else{
                pair.setFirst(val);
                pair.setSecond(val);
                stack.push(pair);
            }
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().getFirst();
    }
    
    public int getMin() {
        return stack.peek().getSecond();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */