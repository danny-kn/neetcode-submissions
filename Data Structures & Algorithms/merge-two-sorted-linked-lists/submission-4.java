class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        populateMinHeap(minHeap, list1);
        populateMinHeap(minHeap, list2);
        if (minHeap.isEmpty()) { return null; }
        ListNode newHead = new ListNode(minHeap.remove());
        ListNode currNode = newHead;
        while (!minHeap.isEmpty()) {
            currNode.next = new ListNode(minHeap.remove());
            currNode = currNode.next;
        }
        currNode.next = null;
        return newHead;
    }

    public void populateMinHeap(PriorityQueue<Integer> minHeap, ListNode list) {
        ListNode currNode = list;
        while (currNode != null) {
            minHeap.add(currNode.val);
            currNode = currNode.next;
        }
    }
}