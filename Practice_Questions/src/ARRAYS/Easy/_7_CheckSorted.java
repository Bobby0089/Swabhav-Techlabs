package ARRAYS.Easy;

public class _7_CheckSorted {

    public static void checkIfSorted(int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] < arr[i+1]){
                flag = true;
            }
        }
        if(flag == true ) System.out.println("Array is Sorted");
        if(flag == false) System.out.println("Array is not Sorted");
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {9,8,7,6,5,4,3,2,1};

        checkIfSorted(arr2);
    }
}
