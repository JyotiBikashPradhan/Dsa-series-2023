package arrays;

public class OccurrenceOfInteger {
    public int solution(int[] arr, int number) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==number){
                count++;
            }
        }
        return count;

    }
}
