public class RedQ1 {
    /**
     * Given a reference to a head node in a linked list of integers, return the sum of all the elements in the list at odd indexes. Assume the head is at index 0.
     * Example:
     *   4 -> 8 -> 15 -> 16 -> 23 -> 42 -> 11 -> 29 -> 34
     *   Expected answer: 95
     *   Sum of elements at odd indexes:
     *   8 + 16 + 42 + 29 = 95
     * 
     * If head is null, return 0.
     * 
     * @param head the had of the linked list
     * @return the sum of the elements at odd indexes
     */
    public static int oddIndexSum(ListNode head) {
        int sum = 0;
        if (head == null) {
            return sum;
        }
        boolean evenIndex = true;

        while (head != null) {
            if (evenIndex == true) {
                evenIndex = false;
                head = head.next; 
            } else {
                evenIndex = true;
                sum += head.data;
                head = head.next;
            }
        }
        return sum;
    }
}
