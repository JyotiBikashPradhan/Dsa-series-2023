package arrays;

public class FindMinMax {


/**    1,2,3,4,75,9
 * min =1
 * max =1
 * 1<2
 * 1<3
 * 1<4
 * 1<75
 * 1<9
 * min=1

 * 1>2 max=2
 * 2>3 max=3
 * 3>4 max=4
 * 4>75 max=75
 * 75>9 max=75
 *
 * 1,75
 **/

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
