package Task_4;

public class Task_4 {
    public static void main (String[] args) {
        MyClass List = new MyClass();
        List.push(10);
        List.push(20);
        List.push(30);
        List.push(50);
        List.push(90);
        System.out.println(List.sum());
    }
}
