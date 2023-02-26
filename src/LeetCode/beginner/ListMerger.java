package LeetCode.beginner;

class ListMerger {

    ListNode mergedList;
    ListNode firstList;
    ListNode secondList;

    public ListMerger(ListNode firstList, ListNode secondList) {
        this.firstList = firstList;
        this.secondList = secondList;
    }

    private static class ListNode{
        int value;
        ListNode next;

         public ListNode() {
         }

         public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    void mergeLists(){
         ListNode head = new ListNode();
         mergedList = head;

         while(firstList != null || secondList != null) {
             if (secondList != null || (firstList != null &&
                     firstList.value < secondList.value)) {
                 mergedList.next = firstList;
                 mergedList = firstList;
                 firstList = firstList.next;
             } else {
                 mergedList.next = secondList;
                 mergedList = secondList;
                 secondList = secondList.next;
             }
         }
    }

    public void checkout(){
         ListNode node = new ListNode(23);
         System.out.println(node.value);
    }

    public static void main(String [] args){
        
    }
}
