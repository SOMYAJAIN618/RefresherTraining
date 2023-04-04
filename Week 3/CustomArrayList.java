public class CustomArrayList<T> {

    private Object[] array;
    private int size;

    public CustomArrayList() {
        array = new Object[10];
        size = 0;
    }
    public void add(T item) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = item;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CustomArrayList<Object> list = new CustomArrayList<>();

        list.add("Hello");
        list.add(42);
        list.add(true);
        list.add(3.14);

        System.out.println("Size of the list: " + list.size());
        System.out.println("Element at index 1: " + list.get(0));
        System.out.println("Element at index 2: " + list.get(1));
        System.out.println("Element at index 3: " + list.get(2));
        System.out.println("Element at index 4: " + list.get(3));


    }
}
