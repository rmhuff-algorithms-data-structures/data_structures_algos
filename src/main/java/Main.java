public class Main {
    public static void main(String[] names) {
        ArrayV1 arr = new ArrayV1(2);
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(1);
        arr.print();
        arr.removeAt(2);
        System.out.println();
        arr.print();
        System.out.println();
        arr.removeAt(1);
        arr.print();
    }
}

