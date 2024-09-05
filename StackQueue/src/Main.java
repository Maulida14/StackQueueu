public class Main {
    public static void main(String[] args) {
        Stack<Integer> stackInt = new Stack<Integer>();
        Stack<Character> stackChar = new Stack<Character>();

        stackInt.push(10);
        stackInt.push(20);
        stackInt.push(30);
        stackInt.push(40);
        stackInt.push(50);

        stackChar.push('a');
        stackChar.push('b');

        stackInt.pop();

        //stackInt.swap(1,2);
        stackInt.hasPop();
    }
}
