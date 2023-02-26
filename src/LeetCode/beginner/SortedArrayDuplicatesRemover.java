package LeetCode.beginner;

import java.util.List;

public class SortedArrayDuplicatesRemover {
    int [] sortedArrayWithDuplicates;
    int arrayWithoutDuplicatesPointer;

    public SortedArrayDuplicatesRemover(int[] sortedArray) {
        this.sortedArrayWithDuplicates = sortedArray;
    }

    public void removeDuplicatesFromArray(){
        int i = 0;

        for(int j = 0; j < sortedArrayWithDuplicates.length; j++){
            sortedArrayWithDuplicates[i++] = sortedArrayWithDuplicates[j];

            while(j != sortedArrayWithDuplicates.length - 1 &&
                    sortedArrayWithDuplicates[j] == sortedArrayWithDuplicates[j + 1]){
                j++;
            }
        }
        arrayWithoutDuplicatesPointer = i;
    }

    public void printArray(){
        for(int i = 0; i < arrayWithoutDuplicatesPointer; i++){
            System.out.print(sortedArrayWithDuplicates[i] + " ");
        }
    }
}
