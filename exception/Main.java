package exception;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);

        list.insertAtStart(4);
        list.insertAt(0, 5);
        list.countNodes();
        list.deleteAt(0);
        list.insert(3);

        list.show();
        list.countNodes();

    }
}
