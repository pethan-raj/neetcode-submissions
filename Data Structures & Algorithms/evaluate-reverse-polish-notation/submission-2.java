class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String ch : tokens){
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
               int a = stack.pop();
               int b = stack.pop();
               int result =0;
               switch(ch) {
                case "+" :
                   result = b + a;
                   break;
                case "-" :
                   result = b - a;  
                   break;
                case "*" : 
                   result = b * a;
                   break;
                case "/" : 
                    result = b / a;     
                    break; 
               }
               stack.push(result);
            } else {
                stack.push(Integer.parseInt(ch));
            }
        } 

        return stack.pop();
    }
}
