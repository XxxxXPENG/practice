package JzOffer.cache;

public class LRU {
    class Node{
        private int key;
        private int val;
        private Node pre;
        private Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    class DoubleList{
        //头虚节点
        private Node head;
        //尾虚节点
        private Node tail;
        private int size;

        // 初始化双向列表
        public DoubleList(){
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.pre = head;
            size = 0;
        }

        //在末尾添加节点
        public void addLast(Node x) {
            x.pre = tail.pre;
            x.next = tail;
            tail.pre.next = x;
            tail.pre = x;
            size++;
        }
    }
}
