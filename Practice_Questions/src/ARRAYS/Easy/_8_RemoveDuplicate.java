package ARRAYS.Easy;

public class _8_RemoveDuplicate {


    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,4,4,5,6,6,7,7,7,7,8,9};

        int[] temp = new int[numbers.length];

        int j=0;
        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i] != numbers[i+1]){
                temp[j] = numbers[i];
                j++;
            }
        }
        temp[j] = numbers[numbers.length-1];

        for (int i = 0; i <= j; i++) {
            System.out.print(temp[i]+" ");
        }
    }
}
