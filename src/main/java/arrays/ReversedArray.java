package arrays;

public class ReversedArray {
    /**
     * arr[]={5,10,20,30,40}
     *  rev[i]=arr[arr.length-i-1];
     *  rev[0]=arr[5-0-1] = rev[0]=arr[4]=40
     *  rev[1]=arr[5-1-1] = rev[1]=arr[3]=30
     *  rev[2]=arr[5-2-1] = rev[2]=arr[2]=20
     *  rev[3]=arr[5-3-1] = rev[3]=arr[1]=10
     *  rev[4]=arr[5-4-1] = rev[4]=arr[0]=5
     *  rev[]={40,30,20,10,5}
     * **/



    public int[] solution (int[] arr){
        int[] rev=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rev[i]=arr[arr.length-i-1];

        }
        return rev;
    }
}
