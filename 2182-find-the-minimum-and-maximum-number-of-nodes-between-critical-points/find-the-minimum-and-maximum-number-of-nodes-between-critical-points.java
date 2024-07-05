/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        if (head.next.next == null)
            return ans;
        int prev = head.val;
        head = head.next;
        List<Integer> criticalPoints = new ArrayList();
        int counter = 1;

        while (head.next != null) {
            if ((head.val > prev && head.val > head.next.val) || (head.val < prev && head.val < head.next.val)) {
                criticalPoints.add(counter);
            }
            prev = head.val;
            head = head.next;
            counter++;
        }
        int size=criticalPoints.size();
        if (size == 1 || size==0)  return ans;
        Collections.sort(criticalPoints);
        ans[0]=criticalPoints.get(size-1)-criticalPoints.get(size-2);
        for(int i=1;i<size;i++){
            ans[0]=Math.min(ans[0],criticalPoints.get(i)-criticalPoints.get(i-1));
        }
        ans[1]=criticalPoints.get(size-1)-criticalPoints.get(0);
        return ans;
    }
}