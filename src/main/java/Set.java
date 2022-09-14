
public class Set {
    private int count = 0;
    private Object[] elements;

    public Set(int size) {
        elements = new Object[size];
    }

    public Set() {
        this(5);
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(Object element) {
        if(contains(element)){
            return;
        }
        if(count == elements.length){
            Object[] bigger = new Object[elements.length *2];
            System.arraycopy(elements,0,bigger,0,count);
            elements = bigger;

        }
        elements[count++] = element;
    }

    public int size() {
        return count;
    }

    public boolean contains(Object element) {
        return getIndex(element) != -1;
    }

    public void delete(Object element) {
        int index = getIndex(element);
        if(index != -1){
            elements[index] = elements[--count];
        }
    }
    private int getIndex(Object element){
        for (int i = 0; i < count; i++) {
            if(elements[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
}




