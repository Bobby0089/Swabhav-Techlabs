package ARRAYS.Easy;

public class _11_MoveZero {

    public static void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void moveZero(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            if(arr[i] == 0 && arr[j] != 0){
                Swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i] != 0){
                i++;
            }
            if(arr[j] == 0){
                j--;
            }
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,1,1,0,0,1,0,1,0,1};

        System.out.println("Original array : ");
        printArray(arr);
        System.out.println();

        moveZero(arr);
        System.out.println("Array after moving zeros :");
        printArray(arr);
    }
}
