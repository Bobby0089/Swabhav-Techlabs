//package ARRAYS.Easy;
//
//import java.util.Scanner;
//
//public class _10_KthLargest {
//
//
//
//    public static int partition_algo(int[] arr, int L, int R){
//        int p = arr[L];
//        int i = L+1;
//        int j = R;
//
//        while(i <= j){
//            if (arr[i]<p && arr[j]>p){
//                swap(arr[i],arr[j]);
//                i++;
//                j--;
//            }
//            if(arr[i] >= p){
//                i++;
//            }
//            if(arr[j] <= p){
//                j--;
//            }
//        }
//        swap(arr[j],arr[p]);
//
//        return j;
//    }
//
//    public static int findKthLArgestNumber(int[] arr, int k){
//        int n = arr.length;
//        int L = 0;
//        int R = n-1;
//
//        int pivot_idx = 0;
//
//        //Kth largest element arr[k-1] descending order mai sorting karenge
//        while(true){
//
//            pivot_idx = partition_algo(arr,L,R);
//            if (pivot_idx == k-1){
//                break;
//            }
//            else if(pivot_idx >=k-1){
//                R = pivot_idx-1;
//            }
//            else{
//                L = pivot_idx+1;
//            }
//        }
//        return arr[pivot_idx];
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of array = ");
//        int s = sc.nextInt();
//
//        System.out.println("Enter "+s+" number of elements:");
//        int[] arr = new int[s];
//        for (int i = 0; i < s; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter Kth number = ");
//        int k = sc.nextInt();
//
//        int ans = findKthLArgestNumber(arr, k);
//
//        System.out.println(k+"th largest element in array is : "+ans);
//    }
//}
