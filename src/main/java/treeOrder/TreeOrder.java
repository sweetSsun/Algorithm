package treeOrder;


public class TreeOrder {
    // 탐색 순서를 출력하기 위한 용도
    StringBuilder sb = new StringBuilder();

    public String preOrder(Node node) {
        if (node != null) {
            sb.append(node.data + " ");
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }

        return sb.toString();
    }

    public String inOrder(Node node) {
        if (node != null) {
            inOrder(node.leftChild);
            sb.append(node.data + " ");
            inOrder(node.rightChild);
        }
        return sb.toString();
    }

    public String postOrder(Node node) {
        if (node != null) {
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            sb.append(node.data + " ");
        }
        return sb.toString();
    }

    public static class Node {
        private int data;
        private Node leftChild;
        private Node rightChild;

        public Node(int data, Node leftChild, Node rightChild) {
            this.data = data;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
    }
}
