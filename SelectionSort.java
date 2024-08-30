// import java.util.Arrays;

// public class SelectionSort {
//     public static void main(String[] args) {
//         int[] array = { 9, 2, 4, 5, -2, 10, 6, 0, 3, 1, 5, 3, -8, 8, 7 };
//         System.out.println("Unsorted Array : " + Arrays.toString(array));

//         for (int i = 0; i < array.length - 1; i++) {
//             int element = i;
//             for (int j = 0; j < array.length - 1 - i; j++) {
//                 if (array[j] < element) {
//                     // updating smallest element
//                     element = array[j];
//                 }
//                 System.out.println(element);
//             }
//             // swap
//             int temp = array[i];
//             array[i] = element;
//             element = temp;

//         }
//         System.out.println("Descending Order Sorted Array : " + Arrays.toString(array));

//     }
// }


public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 9, 2, 4, 5, -2, 10, 6, 0, 3, 1, 5, 3, -8, 8, 7 };

        // assuming smallest number
        int smallestNumber = arr[0];

        for ( int i=0 ; i<arr.length ; i++ ) {
            for ( int j=0 ; j<arr.length ; j++ ) {
                if ( arr[j] < smallestNumber ) {
                    smallestNumber = arr[j];
                } else {
                    continue;
                }
            arr[i] = smallestNumber;
            }
        }
    }
}