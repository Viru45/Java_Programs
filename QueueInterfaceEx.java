import java.util.Queue;
import java.util.LinkedList;

public class QueueInterfaceEx 
{
    public static void main(String[] args) 
    {
        Queue<String> q1 = new LinkedList<>();
        q1.offer("A");
        q1.offer("B");
        q1.offer("C");
        System.out.println("Queue: " + q1);
        System.err.println("Queue peek: " + q1.peek()); //Gets the head of the queue without removing it
        System.err.println("Queue poll: " + q1.poll()); //Removes the head of the queue
        System.err.println("Queue after poll: " + q1);
    }   
}
