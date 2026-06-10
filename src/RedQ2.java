import java.lang.*;

public class RedQ2 {
    /**
     * Returns which has a higher average value: a given linked list or a given tree.
     * 
     * Example:
     *   List:
     *      7 -> 8 -> -2 -> 9 -> 21
     *   Tree:
     *            12
     *          /    \
     *         6      18
     *        / \    /  
     *       4   8  16  
     *   Expected Answer: "tree"
     * 
     *  Explanation:
     *   The average of the list is (7+8+-2+9+21)/5 = 8.6
     *   The average of the tree is (12+6+4+8+18+16)/6 ≈ 10.67
     *   The tree has the bigger average.
     * 
     * You can assume that both the list and the tree are non-null.
     * 
     * You can assume that the differences in averages will be large enough that
     * floating rounding error will not be an issue and that there will not be a tie.
     * 
     * @param head the head of the linked list
     * @param root the root of the tree
     * @return "list" if the list has a bigger average, "tree" if the tree has a bigger average
     */
    public static String biggerAverage(ListNode head, TreeNode root) {
        double listAverage = listAvg(head);
        int tCount = treeCount(root);
        int tSum = treeSum(root);
        double treeAverage = (double) tSum/tCount;

        if (treeAverage > listAverage) {
            return "tree";
        } else {
            return "list";
        }
    }
    //get the avg of a list
    public static double listAvg(ListNode head) {
        int total = 0;
        int length = 0;
        while (head != null) {
            length++;
            total += head.data;
            head = head.next;
        }
        double avg = (double) total / length;
        return avg;
    }

    public static int treeCount(TreeNode root) {
        int count = 0;
        if (root == null) {
            return 0;
        }
        count++;
        count += treeCount(root.left);
        count += treeCount(root.right);
        return count;
    }
    
    public static int treeSum(TreeNode root) {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        sum += root.data;
        sum += treeSum(root.left);
        sum += treeSum(root.right);
        return sum;
    }


}
