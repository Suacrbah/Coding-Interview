/*
Java solution to LeetCode 155: Min Stack.

Level: Easy

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 

Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
Submission:

Success

Runtime: 4 ms, faster than 98.57% of Java online submissions for Min Stack.

Memory Usage: 41.4 MB, less than 10.15% of Java online submissions for Min Stack.
*/

public class MinStack {
    Element top;

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

    public MinStack() { }
    
    public void push(int x) {
        if (top == null) {
            top = new Element(x, x);
        } else {
            Element e = top;
            this.top = new Element(x, Math.min(x, e.min));
            top.next = e;
        }
    }
    
    public void pop() {
        top = top.next;
    }
    
    public int top() {
        return top.val;
    }
    
    public int getMin() {
        return top.min;
    }
}

class Element {
    public int val, min;
    public Element next;

    Element(int val, int min) {
        this.val = val;
        this.min = min;
    }
}