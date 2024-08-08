class Solution {
    public int evalRPN(String[] tokens) {
        int len=tokens.length;
        
        Stack<Integer> stack=new Stack();

        for(int i=0;i<len;i++){
            String token=tokens[i];
            int num1;
            int num2;
            if("+".equals(token)){
                num1=stack.pop();
                num2=stack.pop();
                stack.push(num1+num2);
            }else if("*".equals(token)){
                num1=stack.pop();
                num2=stack.pop();
                stack.push(num1*num2);
            }else if("-".equals(token)){
                num1=stack.pop();
                num2=stack.pop();
                stack.push(num2-num1);
            }else if("/".equals(token)){
                num1=stack.pop();
                num2=stack.pop();
                stack.push(num2 / num1);
            }else{  
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }
}