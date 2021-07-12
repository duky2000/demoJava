package Queue;

import java.util.*;

public class Solution {
    public void enqueue(Queue e, int value) {
        Node1 temp = new Node1(value, null);
        if (e.getFront() == null) {
            e.setFront(temp);
        }

        Node1 cuoiHienTai = e.getRear();
        cuoiHienTai.setLink(temp);
        e.setRear(temp);

    }

    public void displayQueue(Queue queue) {

    }
}
