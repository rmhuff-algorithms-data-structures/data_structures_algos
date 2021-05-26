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

    public void removeAt(int index) {
        //validate index
        //create a new array and populate 'around the index'
        int[] replaceElementsWith = new int[currentCount];
        if(index > 0 && index <= currentCount) {
            for (int i = 0; i < index; i++) {
                replaceElementsWith[i] = elements[i];
            }
            for (int j = index + 1; j < currentCount; j++) {
                replaceElementsWith[j-1] = elements[j];
            }
        currentCount--;
        elements=replaceElementsWith;
        }
    }

}
