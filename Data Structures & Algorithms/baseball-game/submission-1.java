class Solution {
    public int calPoints(String[] operations) {
        

        Stack<Integer> stack = new Stack<>();
        
        int a = 0;
        int b = 0;
        int c = 0;
        int total = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                b = stack.pop();
                a = stack.pop();
                c = b + a;
                stack.add(a);
                stack.add(b);
                stack.add(c);
            } else if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("D")) {
                a = stack.pop();
                stack.add(a);
                stack.add(a * 2);
            } else {
                stack.add(Integer.parseInt(operations[i]));
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            total = total + stack.get(i);
        }
        return total;
  }
}