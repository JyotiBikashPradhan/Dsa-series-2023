package arrays;

public class FindMinMax {

    public int[] solution(int[] arr){

        int[] res=new int[2];

        int min=arr[0];
        int max=arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        res[0]=min;
        res[1]=max;
        return res;

    }

}
