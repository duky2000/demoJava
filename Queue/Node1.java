package Queue;

//import LinkedList.Node;

public class Node1 {
    public int data;
    public Node1 link;

    public Node1(int data, Node1 link) {
        this.data = data;
        this.link = link;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node1 getLink() {
        return link;
    }

    public void setLink(Node1 link) {
        this.link = link;
    }
}
