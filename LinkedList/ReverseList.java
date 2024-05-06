package gfg.LinkedList;

public class ReverseList {


    public static void main(String[] args) {
        ListNode head=new ListNode(3);
        ListNode node2=new ListNode(15);
        ListNode node3=new ListNode(20);
        ListNode node4=new ListNode(30);
        ListNode node5=new ListNode(17);
        ListNode node6=new ListNode(15);
        ListNode node7=new ListNode(16);
        node6.next=node7;
        node5.next=node6;
        node4.next=node5;
        node3.next=node4;
        node2.next=node3;
        head.next=node2;
        System.out.println(reverseList(head));
    }

    public static ListNode reverseList(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode temp;
        while (curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}