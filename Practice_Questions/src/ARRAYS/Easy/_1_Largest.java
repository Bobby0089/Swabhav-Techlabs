package ARRAYS.Easy;


public class _1_Largest {
    public static void main(String[] args) {
        int arr[] = {-12,10,13,30,2,-1,89};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("Largest number  = "+largest);
    }
}
