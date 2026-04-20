import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        
        // Rotate the queue: move all previous elements behind the new one
        while (size > 1) {
            queue.add(queue.poll());
            size--;
        }
    }

    // Removes the element on top of the stack and returns it.
    public int pop() {
        return queue.poll();
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}