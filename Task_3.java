import java.util.LinkedList;

/* Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. 
Используйте итератор */

public class Task_3 {
    public static void main (String[] args) {
        LinkedList <Integer> List = new LinkedList <Integer>();
        List.add(5);
        List.add(4);
        List.add(3);
        List.add(9);
        List.add(12);        
        int sum = 0;        
        for (int i = 0; i < List.size(); i++) {
            sum += List.get(i);
        }
        System.out.println(List);
        System.out.println("Сумма всех элементов: " + sum);
        System.out.println(List);
    }
}
