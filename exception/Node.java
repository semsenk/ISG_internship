package exception;

class Node<Type> {
    Type data;
    Node<Type> next = null;

    public Node(Type data) {
        this.data = data;
    }
}
