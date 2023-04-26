package Task_4;


public class MyClass {
    private Integer [] array = new Integer [10];
    private int size = 0;
    
    void push(int item){
        if (size == array.length){
            Integer[] array2 = new Integer[array.length * 2];
            System.arraycopy(array, 0, array2, 0, array.length);
            array = array2;
        }
        array[size++] = item;
    }
    int sum() {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += array[i];
        }
        return result;
    }
}
