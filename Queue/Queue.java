package Queue;

public class Queue {
    private Node1 front;
    private Node1 rear;

    public Queue(Node1 front, Node1 rear) {
        this.front = front;
        this.rear = rear;
    }

    public Node1 getFront() {
        return front;
    }

    public void setFront(Node1 front) {
        this.front = front;
    }

    public Node1 getRear() {
        return rear;
    }

    public void setRear(Node1 rear) {
        this.rear = rear;
    }
}
