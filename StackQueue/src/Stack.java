public class Stack <T> {
    public Node <T> first;

    public Stack() {
        this.first = null;
    }

    public boolean hasPop() {
       if (this.first == null) {
           System.out.println("Stack saat ini kosong");
           return false;
       } else {
           System.out.println("Stack berisi: ");
           print();
           return true;
       }
    }


    public void push(T value) {
        Node<T> newNode = new Node<T>(value); //ini untuk membuat node baru
        newNode.setNext(this.first); //setNext untuk mangarahkan ke alamat yang dituju saat isi value
        this.first = newNode;
    }

    public Object pop() { // untuk menghapus atau mengeluarkan value dari stack
        //if (!hasPop()) { // ini bakal manggil otomatis hasPop
        if (this.first == null) {
            System.out.println("Stack saat ini kosong, tidak dapat melakukan pop.");
            return '\0'; //ngembaliin value kalau stack kosong
        }
        T value = this.first.getValue();
        this.first = this.first.getNext();
        return value;
    }


    public void swap(int index1, int index2) {
        if (index1 < 0 || index2 < 0) {
            System.out.println("Index tidak boleh bernilai negatif");
            return;
        }
        Node node1 = null, node2 = null, current = this.first;
        int i = 0;

        while (current != null) { // untuk menemukan node pada index1 dan 2
            if (i == index1) {
                node1 = current;
            }
            if (i == index2) {
                node2 = current;
            }
            current = current.getNext();
            i++; //kondisi i akan terus bertambah setiap perulangan untuk mengecek posisi index di dalam stack
        }

        if (node1 == null || node2 == null) { // kalau salah satu bernilai null
            System.out.println("Index melebihi panjang stack");
            return;
        }
        T temp = (T) node1.getValue();
        node1.setValue(node2.getValue());
        node2.setValue(temp);
    }

    public void print() { // buat tampilin hasil program di main
        Node<T> currrent = this.first;
        while (currrent != null) {
            System.out.print(currrent.getValue() + "-> ");
            currrent = currrent.getNext();
        }
        System.out.println();
    }
}
