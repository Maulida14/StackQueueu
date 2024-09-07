public class Queue<T> {
    private NodeQue<T> front;
    private NodeQue<T> tail;

    public Queue() {
        this.front = null;
        this.tail = null;    
    }

    public T peek() {
        if (front == null) {
            throw new NoSuchElementException("queue is empty");
        }
        return front.getValue();
    }
    

    public void swap(int index1, int index2) {
        if (index1 < 0 || index2 < 0) {
            System.out.println("Index tidak boleh negatif");
            return;
        }

        if (index1 == index2) {
            System.out.println("Index sama, tidak bisa menukar");
            return;
        }

        NodeQue<T> node1 = null, node2 = null, current = front;
        int i = 0;

        // Cari node pada index1 dan index2
        while (current != null) {
            if (i == index1) {
                node1 = current;
            }
            if (i == index2) {
                node2 = current;
            }
            current = (NodeQue<T>) current.getNext();
            i++;
        }

        // Jika salah satu node tidak ditemukan
        if (node1 == null || node2 == null) {
            System.out.println("Index melebihi panjang queue, terdapat node yang kosong");
            return;
        }

        // Tukar nilai node1 dan node2
        T temp = node1.getValue();
        node1.setValue(node2.getValue());
        node2.setValue(temp);
    }

}
