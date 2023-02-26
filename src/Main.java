import LeetCode.beginner.SortedArrayDuplicatesRemover;
import LeetCode.beginner.TwoSum;

public class Main {
    public static void main(String[] args) {
        SortedArrayDuplicatesRemover test =  new SortedArrayDuplicatesRemover(new int[]{7,8,8,9,9,9,});
        test.removeDuplicatesFromArray();
        test.printArray();
        /**
         * What does it mean for a class to be package protected?
         *
         * ListMerger listMerger = new ListMerger();
         * If the class ListMerger is not explicitly declared public then it cannot be accessed outside
         * of the package LeetCode.beginer. Hence making it package private
         */
    }
}