public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null; // Menginisialisasi 'next' ke null
    }

    // Setter untuk atribut 'next'
    public void setNext(Node<T> next) {
        this.next = next;
    }

    // Getter untuk atribut 'next'
    public Node<T> getNext() {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    // Getter untuk atribut 'value'
    public T getValue() {
        return value;
    }
}

