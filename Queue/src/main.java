public class main {
    public static void main(String[] args) {
        queue qu = new queue();
        qu.enQueue(10);
        qu.enQueue(15);
        qu.display();
        qu.enQueue(20);
        qu.enQueue(25);
        qu.enQueue(30);
        qu.enQueue(35);
        qu.display();
        qu.deQueue();
        qu.deQueue();
        qu.deQueue();
        qu.deQueue();
        qu.deQueue();
        qu.deQueue();
    }
}
