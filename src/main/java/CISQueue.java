import java.util.Arrays;

public class CISQueue<T> {

    // A property of our Queue class is a Linked List.
    // Use your Linked List class that you created in Lab 1!
    // Thought 1: is aggregation or composition going to be used here?
    // Thought 2: meditate on the word 'abstraction'.

    CISLinkedList<T> linkedList;

    // Our CISQueue class will have a constructor.
    // Our CISQueue constructor will instantiate a Queue of size 1.
    public CISQueue(T first){
        linkedList = new CISLinkedList<>(first);
    }


    // isEmpty
    // Returns a boolean.
    // Indicates whether the Queue is empty.
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    // size
    // Returns an integer.
    // Indicates how many elements are currently in our Queue.
    public int size() {
        return linkedList.size();
    }

    // dequeue
    // Returns the data stored in the node that will be polled.
    public T dequeue(){
        T value = linkedList.peekFirst();
        linkedList.removeFirst();
        return value;
    }

    // enqueue
    // Adds a node to the end of our Queue.
    public void enqueue(T i) {
        linkedList.addLast(i);
    }

    // toString
    // Returns a String representation of our Queue.
    public String toString() {
        return linkedList.toString();
    }
}
