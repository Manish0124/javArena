public class SegmentTtree {

    public static void main(String[] args) {
        int[] arr = {3 , 8 , 7 , 6 , -2 , -8, 4 , 6};

        SegmentTtree tree = new SegmentTtree(arr);

    }
    
    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left ; 
        Node right ;


        public Node(int startInterval , int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTtree(int[] arr){
        //create a tree using this array

       this.root = constructTree(int[] arr , 0 , arr.length -1 );
    }

    private Node constructTree(int[] arr , int start , int end){
        //leaf node
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        //create new node with index you are at 

        Node node = new Node(start, end);

        int mid = (start + end ) / 2;

        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid +1, end);


        node.data = node.left.data + node.right.data;

        return node;
    }

    private void display(){
        display(this.root);
    }
    private void display(Node node ){
        String str = "";
        if(node.left != null){
            str = str+"Interval = ["+ node.left.startInterval + "-" + node.left.endInterval + "] and :" + node.left.data + "->";
        }
        else{
            str = str+"no left node";
        }
        if(node.right != null){
            str = str+"Interval = ["+ node.right.startInterval + "-" + node.right.endInterval + "] and :" + node.right.data + "->";
        }
        else{
            str = str+"no right node";
        }
    }



}
