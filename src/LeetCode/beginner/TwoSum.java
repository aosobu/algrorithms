package LeetCode.beginner;

import java.util.HashMap;

public class TwoSum {
    int[] numbers;
    int targetSum;

    public TwoSum(int[] numbers, int targetSum) {
        this.numbers = numbers;
        this.targetSum = targetSum;
    }

    public int[] findIndicesInNumbersThatEqualsTargetSum(){
        HashMap<Integer, Integer> indices = new HashMap<>();

        for(int i=0; i<numbers.length; i++){
            if(indices.containsKey(targetSum - numbers[i])){
                return new int[] {i, indices.get(targetSum - numbers[i])};
            }else{
                indices.put(numbers[i], i);
            }
        }

        return new int[]{};
    }
}
