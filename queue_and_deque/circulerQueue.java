
class CircularQueue {
    int[] queue;
    int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = size = 0;
    }

    boolean isFull() { return size == capacity; }
    boolean isEmpty() { return size == 0; }

    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        queue[rear] = item;
        rear = (rear + 1) % capacity; 
        size++;
    }

    int dequeue() {
        if (isEmpty()) return -1;
        int item = queue[front];
        front = (front + 1) % capacity; 
        size--;
        return item;
    }
}



public class circulerQueue {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        System.out.println(cq.dequeue()); 
        cq.enqueue(40); 
        System.out.println(cq.dequeue()); 
    }
}
