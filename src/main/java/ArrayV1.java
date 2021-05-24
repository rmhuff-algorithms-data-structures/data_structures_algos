public class ArrayV1 {
    private int[] elements;
    private int currentCount;

    public ArrayV1(int size) {
        this.elements = new int[size];
    }

    public void print(){
        for(int index = 0; index < currentCount; index++){
            System.out.print(elements[index]);
            }
    }

    public void add(int item){
        if (elements.length == currentCount) {
            int[] replaceElementsWith = new int[currentCount * 2];
            for(int i = 0; i < currentCount; i++) {
                replaceElementsWith[i] = elements[i];
            }
            elements = replaceElementsWith;
        }
        elements[currentCount++] = item;
    }

}
