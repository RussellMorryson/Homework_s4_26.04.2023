package Task_2;
/* Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() 
- помещает элемент в конец очереди, dequeue() - возвращает первый элемент 
из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.*/

public class Task_2 {
    public static void main (String[] args) {
        LinkList List = new LinkList();
        List.enqueue(5);
        List.enqueue(15);
        List.enqueue(25);
        System.out.println(List.first());         
        System.out.println(List.dequeue());        
        System.out.println(List.first());
        System.out.println(List.first());         
    }    
}
