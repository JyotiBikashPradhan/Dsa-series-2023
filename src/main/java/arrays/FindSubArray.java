package arrays;

import java.util.Arrays;

public class FindSubArray {

    public int[] solution(int[] arr, int sum) {
        int start = 0;
        int end = -1;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            while (currSum > sum && start <= i) {
                currSum -= arr[start];
                start++;
            }
            if (currSum == sum) {
                end = i;
                break;
            }
        }
        if (end == -1) {
            return new int[] {0, -1};
        } else {
            return Arrays.copyOfRange(arr, start, end + 1);
        }
    }

//    public static void main(String[] args) {
//        int[] arr = {5, 7, 8, 9, 3, 4, 2};
//        int target = 16;
//        FindSubArray fsa = new FindSubArray();
//
//        int[] subArray = fsa.solution(arr, target);
//        if (subArray[0] == 0) {
//            System.out.println("Sub array not found");
//        } else {
//            System.out.println("Sub array found: " + Arrays.toString(subArray));
//        }
//    }
}
