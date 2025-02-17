package exercise;

class SafetyList {
    // BEGIN
    private int size = 0;
    private int[] elements = new int[10];

    public synchronized void add(int number) {
        if(size + 1 >= elements.length) {
            int value = elements.length;
            int newSize = (value * 3)/2 + 1;
            int[] oneElements = elements;
            elements = new int[newSize];
            System.arraycopy(oneElements, 0, elements, 0, size);
        }
        elements[size++] = number;
    }
    public int get(int index) {
        return elements[index];
    }
    public int getSize() {
        return size;
    }
    // END
}
