public class Main {
    public static void main(String[] args) {
        Stack<Integer> stackInt = new Stack<Integer>();
        Stack<Character> stackChar = new Stack<Character>();

        Queue<Integer> integerQueue = new Queue<>();
        Queue<Character> characterQueue = new Queue<>();

        //buat nambahin value di stack
        stackInt.push(10);
        stackInt.push(20);
        stackInt.push(30);
        stackInt.push(40);
        stackInt.push(50);

        stackChar.push('a');
        stackChar.push('b');

        stackInt.pop(); //buat hapus value di stack

        stackInt.swap(1,2); //manggil swap buat nukar posisi value sesuai index
        stackInt.hasPop(); //buat nampilin isi dari stack apabila terdapat value dan menampilkan keterangan false jika stack kosong

        //buat tambahin value dengan tipe data char di queue
        characterQueue.push('a');
        characterQueue.push('b');
        characterQueue.push('c');
        characterQueue.push('d');
        characterQueue.push('e');

        characterQueue.swap(0,2); //swap value di queue sesuai index

        
    }
}
