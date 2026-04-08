package stack_basic;




public class Main {

    public class myStack {
        // array to store elements
        private int[] arr;
        // maximum size of stack
        private int capacity;
        // index of top element
        private int top;

        // constructor
        public myStack(int cap) {
            this.arr = new int[cap];
            this.capacity = cap;
            this.top = -1;
        }
        
        //push operation
        public void push(int x) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
        }

        //pop operation
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }
        
        // peek (or top) operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }
        
        // check if stack is empty
        public boolean isEmpty() {
            return top == -1;
        }
        
        // check if stack is full
        public boolean isFull() {
            return top == capacity - 1;
        }
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();
        myStack st = mainInstance.new myStack(4);

        // pushing elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // popping one element
        System.out.println("Popped: " + st.pop());

        // checking top element
        System.out.println("Top element: " + st.peek());

        // checking if stack is empty
        System.out.println("Is stack empty: " +
                            (st.isEmpty() ? "Yes" : "No"));

        // checking if stack is full
        System.out.println("Is stack full: " +
                            (st.isFull() ? "Yes" : "No"));
    }
}
      