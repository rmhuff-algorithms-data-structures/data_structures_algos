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

    //resize if full
    public void add(int item){
        if (currentCount < elements.length) {
            elements[currentCount] = item;
            currentCount++;
        } else if (currentCount == elements.length) {
            //create a new array that is elements.length + 1;
            //put all elements into that array w/ a for loop;
            //create a setter
            //set elements to that new array
        }
    }

    public void removeAt(int index){

    }


}
