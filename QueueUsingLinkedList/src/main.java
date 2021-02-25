public class main {
    public static void main(String[] args) {
        queue q = new queue();
        q.dequeue();
        q.peek();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        q.dequeue();
        q.dequeue();

    }
}
