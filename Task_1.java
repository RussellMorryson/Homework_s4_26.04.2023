import java.util.LinkedList;

/* Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список. 
Постараться не обращаться к листу по индексам. */
public class Task_1 {
    public static void main (String[] args) {
        LinkedList <Integer> List = new LinkedList <Integer>();
        List.add(15);
        List.add(25);
        List.add(5);
        List.add(55);
        List.add(35);
        System.out.println(List);
        List = reverseFunc(List);
        System.out.println(List);
    }
    static LinkedList <Integer> reverseFunc (LinkedList <Integer> L) {
        LinkedList <Integer> O = new LinkedList <Integer>();
        for(int temp : L) {
            O.addFirst(temp);
        }
        return O;
    }
}