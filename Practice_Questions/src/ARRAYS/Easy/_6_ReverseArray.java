package ARRAYS.Easy;

public class _6_ReverseArray {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8};

        int st = 0;
        int end = numbers.length-1;
        while (st < end){
            int temp = numbers[st];
            numbers[st] = numbers[end];
            numbers[end] = temp;
            st++;
            end--;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
