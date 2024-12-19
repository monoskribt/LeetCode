package Easy;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ImplementStackUsingQueues {

    private Queue<Integer> queue;

    public ImplementStackUsingQueues() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.offer(x);
        for(int i=0; i<queue.size()-1; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        if(queue.isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.remove();
    }

    public int top() {
        if(queue.isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }


}
