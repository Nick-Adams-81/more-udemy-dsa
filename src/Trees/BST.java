package Trees;

public class BST {

    public Node root;

    public boolean insert(int value) {
        Node newNode = new Node(value);
        Node temp = root;
        if(root == null) {
            root = newNode;
            return true;
        }
        while(true) {
            if(newNode.value == temp.value) return false;
            if(newNode.value < temp.value) {
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if(temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        Node temp = root;
        if(root == null) return false;
        while(temp != null) {
            if(temp.value > value) {
                temp = temp.left;
            } else if(temp.value < value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
