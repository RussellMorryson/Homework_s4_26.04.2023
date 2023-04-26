package Task_2;
import java.util.LinkedList;

public class LinkList {
    private LinkedList<Integer> L = new LinkedList<Integer>();   
    private int num = 0;
    
    void enqueue(int number) {
        L.add(number);        
    }
    int dequeue() {
        num = L.pop();
        return num;
    }

    int first() {
        num = L.get(0);
        return num;
    }
}
