package ARRAYS.Easy;

public class _5_SumOFArray {
    public static void main(String[] args) {
        int[] numbers = {-12,10,13,30,2,-1,89};  // given array of integer
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all number  is = "+ sum);
    }
}
