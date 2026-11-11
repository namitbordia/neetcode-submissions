class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s1 = new Stack<>();

        for (String i : tokens) {

            // If token is a number (including negative numbers)
            if (!i.equals("+") && !i.equals("-") && !i.equals("*") && !i.equals("/")) {
                s1.push(Integer.parseInt(i));
            } 
            else {
                int b = s1.pop();   // second operand
                int a = s1.pop();   // first operand

                if (i.equals("+")) {
                    s1.push(a + b);
                } 
                else if (i.equals("-")) {
                    s1.push(a - b);
                } 
                else if (i.equals("*")) {
                    s1.push(a * b);
                } 
                else if (i.equals("/")) {
                    s1.push(a / b);   // integer division
                }
            }
        }
        return s1.peek();

        
    }
}
