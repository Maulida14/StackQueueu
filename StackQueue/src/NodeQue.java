public class NodeQue<T> extends Node<T> {
    protected NodeQue<T> prev;

    public NodeQue(T value) {
        super(value);
        this.prev = null;
    }

    public NodeQue<T> getPrev() {
        return prev;
    }

    public void setPrev(NodeQue<T> prev) {
        this.prev = prev;
    }
}


//enqueue > tambah > di java bisa pakai offer()
//dequeue > hapus > di java bisa pakai poll()
//hasdequeue > ngecek kondisi que (bool)
//double linkedlist (ada prev)
//peek

