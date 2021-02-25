

public class queue {
    //using array, this has drawback
    int q[] = new int[5];
    int front = -1;
    int rear = -1;

    public void enQueue(int data)
    {
        if(rear == 4)
        {
            System.out.println("Queue full");
        }
        else if(front == -1 && rear == -1)
        {
            front++;
            rear++;
            q[rear] = data;
        }
        else
        {
            rear++;
            q[rear] = data;
        }
    }
    public void deQueue()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Queue empty");
        }
        else if(front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            front++;
        }
    }
    public void display()
    {
        if(front == -1 && rear == -1)
            System.out.println("Queue empty");
        else
        {
            for(int i = front ; i <= rear ; i++)
                System.out.println(q[i]);
        }
    }
    public int peek()
    {
        if(front == -1)
        {
            System.out.println("Queue empty");
            return -1;
        }
        else
        {
            return q[front];
        }
    }
}
