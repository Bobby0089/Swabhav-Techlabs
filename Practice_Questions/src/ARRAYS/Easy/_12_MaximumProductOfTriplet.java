package ARRAYS.Easy;

public class _12_MaximumProductOfTriplet {

    static int maxTriplet(int[] arr){
        int ans = 0;

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thirdMAx = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                thirdMAx = secMax;
                secMax = max;
                max = arr[i];
            }
            else if(arr[i] > secMax){
                thirdMAx = secMax;
                secMax = arr[i];
            }
            else if(arr[i] > thirdMAx){
                thirdMAx = arr[i];
            }
            if(arr[i] < min){
                secMin = min;
                min = arr[i];
            }
            else if(arr[i] > secMin){
                secMin = arr[i];
            }
        }
         return ans = Math.max(max * secMax * thirdMAx,
                min * secMin * max);
    }

    public static void main(String[] args) {
        int[] arr = {-10,-3,-5,-6,-20};

        int max = maxTriplet(arr);

        System.out.println("Maximum product is " + max);
    }
}
