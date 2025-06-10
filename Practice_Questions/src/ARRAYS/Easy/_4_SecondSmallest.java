package ARRAYS.Easy;

public class _4_SecondSmallest {

    // static method to calculate second lowest element in array
    public static int SecSmallest(int[] arr){
        // to store smallest value
        int small = Integer.MAX_VALUE;
        // to store second smallest value
        int secsmall = Integer.MAX_VALUE;

        // to iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < small){
                small = arr[i];
            }

            if (arr[i] > small && arr[i] < secsmall){
                secsmall = arr[i];
            }
        }

        return secsmall;
    }

    public static void main(String[] args) {
        int[] numbers = {-12,10,13,30,2,-1,89,-10};  // given array of integer

        System.out.println("Second smallest number is = "+ SecSmallest(numbers));
    }
}
