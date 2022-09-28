//import java.util.ArrayList;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(11);
//        list.add(15);
//        list.add(6);
//        list.add(8);
//        list.add(9);
//        list.add(10);
    }
















    ////////// Pair Sum-2  Sorted and rotated Array(2 pointer Approach) T.C====> O(n)
//    public static boolean pairSum1( ArrayList<Integer> list , int target){
//       int bp = -1; // break point
//        int n = list.size();
//        for(int i = 0 ; i < list.size()-1 ; i++){
//            if(list.get(i+1)<list.get(i)){
//              bp = i;
//              break;
//            }
//        }
//        int lp = bp + 1; //Smallest
//        int rp = bp;// largest
//
//
//        while(lp != rp){
//            //case 1
//            if(list.get(lp) + list.get(rp) == target){
//                return true;
//            }
//            ////// Update pointer
//           // case 2
//            if(list.get(lp) + list.get(rp) < target){
//                lp = (lp + 1) % n;  //basically it is  lp ++
//            }else{
//                //case 3
//                rp = (n + rp -1) % n;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(11);
//        list.add(15);
//        list.add(6);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        int target =16;
//
//        System.out.println(pairSum1(list,target));
//
//    }










    ////////// Pair Sum-1 (2 pointer Approach) T.C====> O(n)
//    public static boolean pairSum1( ArrayList<Integer> list , int target){
//        int lp = 0;
//        int rp = list.size()-1;
//        while(lp < rp){
//            if(list.get(lp) + list.get(rp) == target){
//                return true;
//            }
//            ////// Update pointer
//            if(list.get(lp) + list.get(rp) < target){
//                lp ++;
//            }else{
//                rp --;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        int target =5;
//
//        System.out.println(pairSum1(list,target));
//
//    }














//    ////////// Pair Sum-1 (2 pointer Approach) T.C====> O(n)
//    public static boolean pairSum1( ArrayList<Integer> list , int target){
//        int lp = 0;
//        int rp = list.size()-1;
//      while(lp < rp){
//          if(list.get(lp) + list.get(rp) == target){
//              return true;
//          }
//          ////// Update pointer
//          if(list.get(lp) + list.get(rp) < target){
//              lp ++;
//          }else{
//              rp --;
//          }
//      }
//        return false;
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        int target =5;
//
//        System.out.println(pairSum1(list,target));
//
//    }





    ////////// Pair Sum-1 (brute force) T.C====> O(n^2)
//    public static boolean pairSum1( ArrayList<Integer> list , int target){
//        for(int i = 0 ; i < list.size()-1 ; i ++){
//            for(int j = i + 1 ; j < list.size()-1 ; j ++){
//                if(list.get(i) + list.get(j) == target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        int target =5;
//
//        System.out.println(pairSum1(list,target));
//
//    }









    ////////  Container with most water by using ArrayLIst (2 Pointer Approach)  T.c--> O(n)
//    public static int storeWater(ArrayList<Integer>height){
//        // initialize
//        int maxWater = 0;
//        int rp = height.size() - 1;
//        int lp = 0;
//
//        while(lp < rp){
//            //Calculate water Area
//            int ht = Math.min(height.get(lp),height.get(rp));
//            int width = rp - lp;
//            int currWater = ht * width;
//            maxWater = Math.max(maxWater,currWater);
//
//            // Update pointer
//            if(lp < rp){
//                lp ++;
//            }else{ // rp > lp
//               rp --;
//            }
//
//        }
//        return  maxWater;
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> height = new ArrayList<>();
//        height.add(1);
//        height.add(8);
//        height.add(6);
//        height.add(2);
//        height.add(5);
//        height.add(4);
//        height.add(8);
//        height.add(3);
//        height.add(7);
//
//        System.out.println("Maximum Stored water is " + storeWater(height));
//
//    }









    ////////  Container with most water by using ArrayLIst (Brute Force)  T.c--> O(n^2)
//    public static int storeWater(ArrayList<Integer>height){
//        int maxWater = 0;
//        for(int i = 0 ; i < height.size() ; i++){
//            for(int j = i + 1 ; j < height.size() ; j ++){
//                int width = j - i;
//                int ht = Math.min(height.get(i),height.get(j));
//                int currentWater = width * ht;
//                maxWater = Math.max(maxWater,currentWater);
//
//            }
//        }
//       return maxWater;
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> height = new ArrayList<>();
//        height.add(1);
//        height.add(8);
//        height.add(6);
//        height.add(2);
//        height.add(5);
//        height.add(4);
//        height.add(8);
//        height.add(3);
//        height.add(7);
//
//        System.out.println("Maximum Stored water is " + storeWater(height));
//    }








        ////////  Container with most water by using Array
//    public static void main(String[] args) {
//        int height [] = {1,8,6,2,5,4,8,3,7};
//        for(int i = 0 ; i < height.length ; i++){
//            for(int j = i + 1 ; j < height.length ; j ++){
//                int width = j - i;
//                int ht = Math.min(height[i],height[j]);
//                int waterArea = width * ht;
//                System.out.println(" Area of line " + i + " and " + j + " is " + waterArea);
//            }
//        }
//    }






    ////////// Multi Dimensional ArrayList
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> list3 = new ArrayList<>();
//
//        for (int i = 1 ; i <= 5 ; i++){
//            list.add(i * 1);
//            list2.add(i * 2);
//            list3.add(i * 3);
//        }
//        mainList.add(list);
//        mainList.add(list2);
//        mainList.add(list3);
//
//        list2.remove(4);
//        list2.remove(3);
//
//        System.out.print(mainList);
//        System.out.println();
//
//
//
//        for(int i = 0 ; i < mainList.size() ; i ++){
//            ArrayList<Integer> currList = mainList.get(i);
//            for(int j = 0 ; j < currList.size() ; j ++){
//                System.out.print(currList.get(j) + " ");
//            }
//            System.out.println();
//        }
//    }



















    ///// BINARY SEARCH
//    public static int binarySearch(ArrayList<Integer>numbers , int key){
//        int start =0,end = numbers.size() - 1;
//        while(start <= end){
//            int mid = (start + end)/2;
//            // Comparisons
//         if(numbers.get(mid) == key){
//             return mid;  // key found at middle rest of the line will not be read
//         }
//         if(numbers.get(mid) < key){
//             start = mid +1;// second half (left)
//         }else{
//            end = mid - 1; // first half
//         }
//        }
//        return -1;  // if key not found at any condition -1
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(2);
//        numbers.add(4);
//        numbers.add(6);
//        numbers.add(8);
//        numbers.add(10);
//        numbers.add(12);
//        numbers.add(14);
//        System.out.println(numbers);
//
//        int key = 10; // Finding number
//         int index = binarySearch(numbers,key);
//         if(index == -1){
//             System.out.println("key not found at any Index");
//         }else {
//             System.out.println("Key found at index " + index);
//         }
//    }









    ///// Sorting by using inbuilt function
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(); // Syntax
//        list.add(2);
//        list.add(5);
//        list.add(9);
//        list.add(3);
//        list.add(6);
//        System.out.println(list);
//
//        // Sort in Ascending Order
//        Collections.sort(list);
//        System.out.println(list);
//
//        // Sort in Descending Order
//        Collections.sort(list , Collections.reverseOrder());
//        System.out.println(list);
//
//    }






    ////////// Swap ArrayList Element
//    public static void swap(ArrayList<Integer> list , int idx1 ,int idx2){
//       int temp = list.get(idx1);
//       list.set(idx1 , list.get(idx2));
//       list.set(idx2 , temp);
//        System.out.println(list);
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(); // Syntax
//       list.add(2);
//        list.add(5);
//        list.add(9);
//        list.add(3);
//        list.add(6);
//        int idx1 = 1 , idx2 = 3;
//        System.out.println(list);
//        swap(list,idx1,idx2);
//
//
//}







//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(); // Syntax


       //// // Add an element    T.C --> O(1)
//        list.add(2);
//        list.add(5);
//        list.add(9);
//        list.add(6);
//        list.add(8);
//        System.out.println(list);

        ////// Another method for adding element T.C ----> O(n)
//        list.add(1,6);

       ///// // Get an element using function objectName.get(index);  T.C ---> O(1)
//       int element = list.get(3);
//        System.out.println(element);


        /////// Remove an element using function objectName.remove(index);  T.C ---> O(n)
//        int removeElement = list.remove(3);
//        System.out.println(list);


        /////// Set an element using function objectName.set(index, new element);  T.C ---> O(n)
//        int setElement = list.set(3,10);
//        System.out.println(list);

       ////// // Contains an element using function objectName.contains(checking element);  T.C ---> O(n)
//        System.out.println(list.contains(5));
//        System.out.println(list.contains(12));


        //////Size of ArrayList
//        System.out.println(list.size());
//
//        ////// To print particular index
//        for(int i = 0 ; i < list.size() ; i ++){
//
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();


        ///// Print reverse
        // To print particular index
//        for(int i = list.size()-1 ; i < 0 ; i --){
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();




        ///// Print max value   T.C---> O(n)
//
//        int max = Integer.MIN_VALUE;
//        for(int i = 0 ; i < list.size() ; i ++){
//            if(max< list.get(i)){
//                max = list.get(i);
//            }
//        }
//        System.out.println("My max value " + max);
//
//
//
//
//
//    }
}
