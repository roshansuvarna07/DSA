import java.util.*;
public class Sorting {

}






    /////// Inbuilt Sort
//    public  static  void printArray(Integer arr[]){
//        for(Integer i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        Integer arr[] = {5,4,1,3,2};
//        Arrays.sort(arr,Collections.reverseOrder());  //inbuilt function to sort array
//       // Arrays.sort(arr,0,3 );
//        printArray(arr);
//
//    }
//
//}







////// Insertion Sort
//    public static void insertionSort(int arr[]){
//        for(int i=0 ;i <arr.length;i++){
//            int curr = arr[i];
//            int prev = i-1;
//            //finding out correct pos to insert
//            while(prev>=0 && arr[prev] > curr){
//                arr[prev +1] = arr[prev];
//                prev --;
//            }
//            arr[prev + 1] = curr;
//        }
//    }
//    public  static  void printArray(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int arr[] = {5,4,1,3,2};
//        insertionSort(arr);
//        printArray(arr);
//
//    }
//
//}



         ///// Selection Sort
//    public static void selectionSort(int arr[]){
//        for(int i=0;i < arr.length-1;i++){
//            int minPos = i; // minPos ==> minimum position
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[minPos] > arr[j]){
//                    minPos = j;
//                }
//                //swap
//                int temp = arr[minPos];
//                arr[minPos] = arr[i];
//                arr[i] = temp;
//            }
//        }
//    }
//    public static void printArray(int arr[]){
//        for(int i =0 ; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//     int arr[] = {5,4,1,3,2};
//     selectionSort(arr);
//     printArray(arr);
//    }
//}



       //// Bubble sort
//    public static void bubbleSort(int arr[]){
//        for(int turn=0;turn < arr.length-1;turn ++){  ///no. of Turns
//            for(int j =0;j<arr.length-1-turn;j++){
//                if(arr[j] > arr[j+1]){
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
//    public static void printArr(int arr[]){
//        for(int i = 0;i < arr.length;i ++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int arr[] = {5,4,1,3,2};
//        bubbleSort(arr);
//        printArr(arr);
//    }
//}
