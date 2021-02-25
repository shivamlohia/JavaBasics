public class queue
{
    //queue using linked list
    Node rear;
    Node front;
    int size;
    public boolean isEmpty()
    {
        if(size == 0)
            return true;
        return false;
    }
    public void enqueue(int data)
    {
        Node node = new Node(data);
        if(front == null)
        {
            rear = node;
            front = node;
            size++;
        }
        else
        {
            rear.next = node;
            rear = node;
            size++;
        }
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue empty");
            return -1;
        }
        int d = front.data;
        front = front.next;
        size--;
        return d;
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Empty");
            return -1;
        }
        return front.data;
    }
}
