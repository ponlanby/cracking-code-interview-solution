package linkedlist;

/**
 * @author tongruochen
 * @since 2019/12/31
 */
public class Test {

    public static void main(String[] args) {
        ListNode nodeA5 = new ListNode(5, null);
        ListNode nodeA4 = new ListNode(7, nodeA5);
        ListNode nodeA3 = new ListNode(0, nodeA4);
        ListNode nodeA2 = new ListNode(4, nodeA3);
        ListNode nodeA1 = new ListNode(7, nodeA2);

        ListNode nodeB5 = new ListNode(4, null);
        ListNode nodeB4 = new ListNode(3, nodeB5);
        ListNode nodeB3 = new ListNode(2, nodeB4);
        ListNode nodeB2 = new ListNode(7, nodeB3);
        ListNode nodeB1 = new ListNode(2, nodeB2);

        LinkedListSolutions linkedListSolutions = new LinkedListSolutions();
//        linkedListSolutions.plusAB(nodeA1, nodeB1);

        int[] input = {54695,46580,6418,52304,5595,5149,51943,11454,23596,6444,61037,94146,50220,98642,97292,57898,11745,7286,31224,5160,41550,25277,59350,53353,68663,9642,30406,5396,3222,67194,7124,54247,15077,97688,36939,62888,80307,65467,6882,97071,39652,38268,88226,89088,92198,39003,9858,73803,83078,24648,49891,34551,57649,24443,30685,68740,55407,53155,87465,89282,41856,96218,37292,24551,67663,31715,46363,25573,61921,56333,69576,55919,19818,26409,21590,70392,67648,36909,89175,74443,41856,11755,24788,25975,25116,57360,80998,62093,40691,91189,29337,68914,57653,64272,53653,5975,27967,59600,25803,13937,93725,26457,16603,18360,79926,63243,94958,45131};
        StackSolutions stackSolutions = new StackSolutions();
        stackSolutions.twoStacksSort(input);

    }
}
