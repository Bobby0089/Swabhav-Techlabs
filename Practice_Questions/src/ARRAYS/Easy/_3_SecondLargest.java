package ARRAYS.Easy;

public class _3_SecondLargest {
    // static method to calculate second largest element in array
    public static int SecLargest(int[] arr){
        // to store largest value
        int largest = Integer.MIN_VALUE;
        // to store second largest value
        int seclargest = Integer.MIN_VALUE;

        // to iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                seclargest = largest;
                largest = arr[i];
            }

            if (arr[i] < largest && arr[i] > seclargest){
                seclargest = arr[i];
            }
        }

        return seclargest;
    }

    public static void main(String[] args) {
        int[] numbers = {-12,10,13,30,2,-1,89};  // given array of integer

        System.out.println("Second Largest number is = "+ SecLargest(numbers));
    }
}
