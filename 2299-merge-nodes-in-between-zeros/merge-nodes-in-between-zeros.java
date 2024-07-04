/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode ans=new ListNode();
        
        ListNode finalAns=ans;
        
        head=head.next;

        int sum=0;

        while(head!=null){
            if(head.val!=0){
                sum+=head.val;
            }else{
                if(ans.val==0){
                    ans.val=sum;
                }else{
                    ans.next=new ListNode(sum);
                    ans=ans.next;
                }
                sum=0;
            }
            head=head.next;
        }

        return finalAns;
    }
}