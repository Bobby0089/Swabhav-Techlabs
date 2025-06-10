package ARRAYS.Easy;

public class _2_Smallest {
        public static void main(String[] args) {
            int arr[] = {-12,10,13,30,2,-1,89};
            int smallest = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(smallest > arr[i]){
                    smallest = arr[i];
                }
            }
            System.out.println("Largest number  = "+ smallest);
        }

}
