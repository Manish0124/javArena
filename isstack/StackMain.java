package isstack;

public class StackMain {
    public static void main(String[] args) throws StackException {
       CustomStack stack = new DynamicStack(4);
        stack.push(12);
        stack.push(15);
        stack.push(19);
        stack.push(16);
        stack.push(13);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
