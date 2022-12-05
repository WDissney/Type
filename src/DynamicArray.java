import java.util.Arrays;

public class DynamicArray<T> {
    public T[] arr;

    public void add(T el) {
        if (arr == null){
            T[] newArr = new [1];
        }
        T[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = el;
        this.arr = newArr;
    }

    public void remove(int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Не правильный индекс");
        }
        T[] result = Arrays.copyOf(arr, arr.length - 1);
        System.arraycopy(arr, 0, result, 0, index);
        System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);
        this.arr = result;
    }

    public T getIndex(int index) {
        try {
           return arr[index];
        } catch (NullPointerException e){
            System.out.println("Нет такого индекса");
            return null;
        }
    }
}
