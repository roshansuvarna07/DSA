public class QuickSort {
    public static void printArr(int arr[]){
        for(int i =0 ; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei){
        // base case
        if(si >= ei){
            return;
        }

        // pivot is picked from "Last Element"
       int pivotIndex = partition(arr,si,ei);

        quickSort(arr,si,pivotIndex-1); // left side  (0 to i-1)
        quickSort(arr,pivotIndex+1,ei); // Right side (i + 1 to  ei)

    }

    public  static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];  //  picking last element
        int i = si - 1;   // intialize index i by -1 and it is used to make place for elements smaller than pivot

        for(int j = si ; j < ei ; j++){  // Loop is runned till 4th index because of last element
            if(arr[j] <= pivot){
                i ++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;  //  Result :  {'3','2' ,9,8, '6' ,5}
            }
        }
        // to set pivot on correct index
        i ++;
        int temp = pivot;
        arr[ei] = arr[i];     //  pivot = arr[i] is wrong  X
        arr[i]  = temp;  ///  Result :  {3,2, '5' ,8,6, '9'}
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
