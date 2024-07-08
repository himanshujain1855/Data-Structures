class Solution {
    public static int findTheWinner(int n, int k) {
        if (n == 1 && k == 1)
            return 1;
        if(k==1) return n;
        Node head = new Node(1);
        Node temp = head;

        for (int i = 2; i <= n; i++) {
            temp.next = new Node(i);
            if (i == n) {
                temp.next.next = head;
            } else {
                temp = temp.next;
            }
        }

        int counter = 1;
        Node startNode = head;
        Node tempNode;
        Node prevNode = head;
        while (true) {
            tempNode = startNode;
            while (counter <= k) {
                if (counter == k) {
                    startNode = prevNode.next.next;
                    prevNode.next = tempNode.next;
                } else {
                    prevNode = tempNode;
                    tempNode = tempNode.next;
                }
                counter++;
            }
            counter = 1;
            if (startNode.val == startNode.next.val)
                return startNode.val;
        }
    }
}

class Node {
    int val;
    Node next;

    Node() {

    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
