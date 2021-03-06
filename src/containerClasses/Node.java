package containerClasses;


public class Node<T> {
    private Node next;
    private T data;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node(Node next, T data) {
        this.next = next;
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
