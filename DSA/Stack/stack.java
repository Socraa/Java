import java.util.Stack;
public class stack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("You're");
        stack.push("not");
        stack.push("like");
        stack.push("us");
        stack.push("Drake");

         stack.pop(); // Remove Drake out of the stack

        System.out.println(stack.peek()); // return "us" since Drake is gone. Peek will return the last in item without removing it.
        // Output: us

        System.out.println(stack.search("like"));
        // Output: 2 // it will return its position not the index, drake got pop so it will start at "us"
        // if you search an item without in the stack, it will return -1
        
    }
    
}
