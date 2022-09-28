public class SortedAndRotatedArray {
    public static int search(int arr[],int target,int si,int ei){
        // base case
        if(si > ei){
            return -1;
        }
        // Work to do:
        int mid = si + (ei - si) / 2;


        // case Found
        if(arr[mid] == target){
            return mid;
        }


        // Mid on L1
        if(arr[si] <= arr[mid]) {
            //case a : left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            }
            // case b : right
            else {
                return search(arr, target, mid + 1, ei);
            }
        }

            // Mid on L2
            else {
            // case c: right
            if (arr[mid] <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            // case d : left
            else {
                return search(arr, target, mid - 1, si);
            }

        }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0; // element to find
        int tagetIndex = search(arr,target,0,arr.length-1);

        if(tagetIndex == -1){
            System.out.println("Target Not Found");
        }else{
            System.out.println("Target Found at Index " + tagetIndex);
        }
    }
}
