public class MergeSort {
      /// Time complexity O(nlogn)   &   Space complexty O(n)
    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int si,int ei){
        //Base case
        if(si >= ei){
            return;
        }

        // WORK TO DO

        int mid =si + (ei - si) / 2;  // or we can also write  (si + ei)/2
        mergeSort(arr,si,mid);  // Left part
        mergeSort(arr,mid +1,ei);  // Right Part

        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        // left(0,3) ==> 4 elements     right(4,6) ==> 3 elements
        int temp[] = new int[ei - si + 1];  // syntax for temporary array
        int i = si; // iterator for left part
        int j = mid +1;  // iterator for right part
        int k = 0; // iterator for temporary array

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                 temp[k] = arr[i];
                 i ++;
            }else{
                temp[k] = arr[j];
                j++;
            }
           k ++;
        }

        //if elements are remained in Left part
        while(i <= mid){
            temp[k ++] = arr[i ++];
        }

        //if elements are remained in Right part
        while(j <= ei){
            temp[k ++] = arr[j ++];
        }

        // Copying temp Arr into original Arr
        for(k=0, i= si ; k < temp.length ; k++,i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
