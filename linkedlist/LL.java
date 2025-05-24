package linkedlist;

import java.util.List;

public class LL {

    private Node head;
    private Node tail;
    private Node next;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

     
    // using recursion in linked list 

    public void insertRec(int val, int index){
       head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index  , Node node){
         if (index == 0) {
            Node temp = new Node(val , node);
            size++;
            return temp;
         }

         node.next = insertRec(val, index -1, node.next);
         return node;
    }
 


    public int deleteLast() {

        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;

    }
    
    public Node find(int value){
        Node node = head;
        if (node!=null) {
            if (node.value ==  value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public int delete(int index){
            if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Index out of bounds");
    }
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size -1) {
            return deleteLast();
        }

        Node prev = get(index-1);
         if (prev.next == null) {
        throw new IllegalStateException("Invalid state: next node is null");
    }
        int val = prev.next.value;

        prev.next = prev.next.next;

        size--;

        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "" + "->");
            temp = temp.next;
        }

        System.out.println("END");

    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

   //merge 

   public static LL merge(LL first , LL second){
        
      Node f = first.head;
      Node s = second.head;

      LL ans = new LL();

      while (f!= null && s!= null) {
        if (f.value<s.value) {
            ans.insertLast(f.value);
            f = f.next;
        }
        else{
            ans.insertLast(s.value);
            s = s.next;
        }
      }

      while (f!=null) {
        ans.insertLast(f.value);
        f = f.next;
      }
      while (s!=null) {
        ans.insertLast((s.value));
        s = s.next;
      }

      return ans;
       
   }


   //questions

   public void dublicates(){
       Node node = head;
       while (node.next!=null) {
         if (node.value == node.next.value) {
            node.next = node.next.next;
            size--;
         }
         else{
            node = node.next;
         }
       }

       tail = node;
       tail.next = null;
   }

   //is cycle present or not 

   public boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;

        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
   }

   //find the length of the cycle

   public int lengthCycle(Node head){
    Node fast = head;
    Node slow = head;

    while (fast!=null && fast.next!=null) {
        fast = fast.next.next;
        slow = slow.next;
        if (fast == slow) {
            //  logic to find the lentgh
            Node temp = slow;
            int length = 0;

            do{
                temp = temp.next;
                length++;
            }while(temp !=slow);
               return length;
           
        }
    }

    return 0;
   }

   //is happynumber or not 

   public boolean isHappy(int n){
      int slow = n;
      int fast = n;

      do{
         slow = findSquare(slow);
         fast = findSquare(findSquare(fast));
      } while(slow!=fast);

      if (slow == 1) {
         return true;
      }
      return false;
   }

   private int findSquare(int number){
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans+= rem*rem;
            ans/=10;
        }
        return ans;
   }


   //middle node in ll
   public Node middleNode(Node head){
    Node s = head;
    Node f = head;

    while (f!=null && f.next!=null) {
        s = s.next;
        f = s.next.next;
    }
    return s ;
   }

   //recursion reverse 

   private void reverse(Node node){
       if (node == tail) {
          head = tail; 
          return;
       }

       reverse(node.next);
       tail.next = node;
       tail = node;
       tail.next = null;
   }


   //in place reversal of linked list

   public void reverse(){
    if (size<2) {
        return;
    }

    Node prev = null;
    Node preset = head;
    Node next = preset.next;
     
    while (preset != null) {
        preset.next = prev;
        prev = preset;
        preset = next;

        if (next!=null) {
            next = next.next;
        }
    }
    head = prev;

   }

   public static void main(String[] args) {
      
    // LL list = new LL();
    // list.insertLast(12);
    // list.insertLast(12);
    // list.insertLast(13);
    // list.insertLast(14);
    // list.insertLast(14);
    // list.insertLast(14);
    // list.insertLast(15);
    // list.display();
    // list.dublicates();
    // list.display();
   
    // LL first = new LL();
    // LL second = new LL();
    
    // first.insertLast(1);
    // first.insertLast(3);
    // first.insertLast(5);

    // second.insertLast(1);
    // second.insertLast(2);
    // second.insertLast(9);
    // second.insertLast(14);

    // LL ans = LL.merge(first, second);

    // ans.display();
 
    //to run the cycle is present or not you have to use the static in Node 
   Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; 
   
        LL list = new LL();

        // boolean result = list.hasCycle(node1);
        // System.out.println(result);

        int result = list.lengthCycle(node1);
        System.out.println(result);
    }


}
