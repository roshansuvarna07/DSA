import java.util.Scanner;
import java.util.*;

public class Arrays {
    public static int buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

//        for(int i = 0; i < prices.length ; i ++){
//            if(buyPrice < prices[i]){ // if it is Profit
//                int profit = prices[i] - buyPrice;   // to get max profit from day 1  to  present day
//                maxProfit = Math.max(maxProfit,profit);
//            }else{
//                buyPrice = prices[i];
//            }
//        }

        return  maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStock(prices));
    }
}









    //// Trappinng Rain water [Time Comlexity : O(n) ]
//    public static int trappedRainWater(int height[]){
//        // calculate left max boundary - in Array
//        int leftMax[] = new int[height.length];
//        leftMax[0] = height[0]; // satrts
//        for(int i = 1;i<height.length;i++){
//            leftMax[i] = Math.max(height[i],leftMax[i - 1]); // Compare current height with previous left Max boundary
//        }
//        // calculate right max boundary - in Array
//        int rightMax[] = new int[height.length];
//        rightMax[height.length -1] = height[height.length -1];
//        for(int i = height.length - 2 ; i >= 0 ; i --){
//            rightMax[i] = Math.max(height[i],rightMax[i + 1]); // Compare current height with previous right Max boundary
//        }
//         int trappedWater = 0;
//        //loop
//        for(int i = 0;i <height.length;i ++){
//            //waterLevel = min(leftmax bound , rigtmax bound)
//
//            int waterLevel = Math.min(leftMax[i],rightMax[i]);
//
//            //trapped water =waterLevel - height[i]
//
//            trappedWater += waterLevel - height[i];
//        }
//        return trappedWater;
//    }
//    public static void main(String[] args) {
//        int height[] = {4,2,0,6,3,2,5};
//        System.out.println(trappedRainWater(height));
//    }
//}






    /////// MaxSub Array sum (Kadanes Algorithm)  [ O(n)]
//    public static void kadanes(int numbers[]){
//        int ms = Integer.MIN_VALUE;  /// max sum
//        int cs = 0;  // current sum
//
//        for(int i = 0;i < numbers.length;i++){
//            cs =cs +numbers[i];
//            if(cs < 0){
//                cs =0;  // if cs is negative value
//            }
//            ms = Math.max(cs,ms); /// to get max sum
//        }
//        System.out.println("Our max sub array sum is " + ms);
//    }
//    public static void main(String[] args) {
//        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
//                kadanes(numbers);
//    }
//}






    /////// MaxSub Array (prefix array Approach)  [ O(n^2)]
//    public static void maxSubArraySum(int numbers[]){
//        int currentSum = 0;
//        int MaxSum = Integer.MIN_VALUE;
//        int prefix[] = new int[numbers.length];
//        prefix[0] = numbers[0];
//        // calculate prefix
//        for(int i = 1;i< numbers.length;i++){
//            prefix[i] = prefix[i -1] + numbers[i];
//        }
//
//        for(int i = 0;i <numbers.length;i ++){ /// outer pair
//            int start = i; /// this line is just for understanding
//            for(int j = i;j <numbers.length;j ++){
//                int end = j;
//                // ternary operator
//                currentSum =start == 0 ? prefix[end] : prefix[end] - prefix[start -1];
//
//                if(MaxSum < currentSum){
//                    MaxSum = currentSum;
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//        System.out.println("Maximum sum of sub array is " + MaxSum);
//    }
//    public static void main(String[] args) {
//        int numbers[] = {1,-2,6,-1,3};
//        maxSubArraySum(numbers);
//    }
//}







          //// MAXIMUM SUB ARRAY (Brute force Approach : try to run the problem ) (time comlexity :O(n^3) )
//    public static void maxSubArraySum(int numbers[]){
//        int currentSum = 0;
//        int MaxSum = Integer.MIN_VALUE;
//        for(int i = 0;i <numbers.length;i ++){ /// outer pair
//            int start = i; /// this line is just for understanding
//            for(int j = i;j <numbers.length;j ++){
//                int end = j;
//                currentSum =0;
//                for(int k = start;k <= end;k++){
//                   currentSum += numbers[k];  //// sub array sum
//                }
//                System.out.print(currentSum);
//                if(MaxSum < currentSum){
//                    MaxSum = currentSum;
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//        System.out.println("Maximum sum of sub array is " + MaxSum);
//    }
//    public static void main(String[] args) {
//        int numbers[] = {1,-2,6,-1,3};
//        maxSubArraySum(numbers);
//    }
//}






        ////// Sub Array
//    public static void printSubArrays(int numbers[]){
//        int TSA = 0; //TSA ===> Total Sub Array
//        for(int i = 0;i <numbers.length;i ++){ /// outer pair
//            int start = i; /// this line is just for understanding
//            for(int j = i;j <numbers.length;j ++){
//                int end = j;
//                for(int k = start;k <= end;k++){
//                    System.out.print(numbers[k] + " ");
//                }
//                TSA++;
//                System.out.println();
//            }
//            System.out.println();
//        }
//        System.out.println("Total Sub Array is " + TSA);
//    }
//    public static void main(String[] args) {
//        int numbers[] = {2,4,6,8,10};
//        printSubArrays(numbers);
//    }
//}




//    public static void printPairs(int numbers[]){
//        int TotalPair =0;
//        for(int i = 0;i <numbers.length;i ++){ /// outer pair
//            int current = numbers[i];
//            for(int j = i+1;j <numbers.length;j ++){
//                System.out.print("(" + current + "," + numbers[j] + ")" + " ");
//                TotalPair ++;
//            }
//            System.out.println();
//        }
//        System.out.println("Total Pair :"  + TotalPair);
//    }
//    public static void main(String[] args) {
//        int numbers[] = {2,4,6,8,10};
//        printPairs(numbers);
//    }
//}







      /////  REVERSE AN ARRAY
//    public static void reverseArray(int numbers[]){
//        int start =0,end = numbers.length-1;
//        while(start < end) {
//            // swap
//            int temp = numbers[start];
//            numbers[start] = numbers[end];
//            numbers[end] = temp;
//            start++;
//            end--;
//        }
//    }
//    public static void main(String[] args) {
//       int numbers[] = {2,4,6,8,10};
//       reverseArray(numbers);
//       for(int i = 0;i < numbers.length;i++){
//           System.out.print(numbers[i] + " ");
//       }
//
//    }
//}







      ///// BINARY SEARCH
//    public static int binarySearch(int numbers[],int key){
//        int start =0,end = numbers.length - 1;
//        while(start <= end){
//            int mid = (start + end)/2;
//            // Comparisons
//         if(numbers[mid] == key){
//             return mid;  // key found at middle rest of the line will not be read
//         }
//         if(numbers[mid] < key){
//             start = mid +1;// second half (left)
//         }else{
//            end = mid - 1; // first half
//         }
//        }
//        return -1;  // if key not found at any condition -1
//    }
//    public static void main(String[] args) {
//        int numbers[] = {2,4,6,8,10,12,14};  // Sorted Array
//        int key = 10; // Finding number
//         int index = binarySearch(numbers,key);
//         if(index == -1){
//             System.out.println("key not found at any Index");
//         }else {
//             System.out.println("Index found at " + index);
//         }
//    }
//}




    /////// find the largest number(LINEAR SEARCH)
//    public static int getLargest(int numbers[]){
//       int largest = Integer.MIN_VALUE;// - infinity to take lowest value of given Array
//        int smallest = Integer.MAX_VALUE;  //  + infinity to take largest value of given Array
//       for(int i=0;i<numbers.length;i++){
//           if(largest <numbers[i]){
//               largest = numbers[i];
//           }
//           if(smallest > numbers[i]) {
//               smallest = numbers[i];
//           }
//       }
//        System.out.println("The smallest value of given array is " + smallest);
//       return largest;
//    }
//    public static void main(String[] args) {
//        int numbers[] ={7,2,5,9,5,2,5,2,4,5};
//       int largestNumber = getLargest(numbers);
//        System.out.println("The largest value of given array is " + largestNumber);
//    }
//}



             ////// find the given number on the given Array
//    public static int linearSearch(int numbers[],int key){
//        for(int i =0;i < numbers.length;i++){
//            if(numbers[i] == key){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int numbers[] = {2,4,6,8,10,12,14,16};
//        int key = 10;
//       int index = linearSearch(numbers,key);
//       if(index == -1){
//           System.out.println("Key not found");
//       }else{
//           System.out.println("Key found at index :" + index);
//       }
//    }
//}




    //////// Arrrays as Function and Arguments
//    public static void update(int marks[],int nonChangeAble){
//        nonChangeAble = 15;
//        for(int i=0;i < marks.length;i++){
//           marks[i] = marks[i] + 1;
//        }
//    }
//    public static void main(String[] args) {
//        int marks[] = {95,98,96};
//        int nonChangeAble = 5;
//        update(marks,nonChangeAble); //Value of the marks is updated by the help of Call by Reference
//        System.out.println(nonChangeAble);
//        for(int i=0;i < marks.length;i++){
//            System.out.println(marks[i]);
//        }
//    }
//}





//    public static void main(String[] args) {
//        int marks[] = new int[50];// creating an array
//        Scanner sc = new Scanner(System.in);
//        marks[0] = sc.nextInt();// physics
//        marks[1] = sc.nextInt();// chemistry
//        marks[2] = sc.nextInt();//maths
//        marks[3] = sc.nextInt();//statistics
//        int percentage = ( marks[0] +  marks[1] +  marks[2] +  marks[3]) / 4;
//        int numbers[] = {1,2,3}; // when we declare elements we know the size
//
//
//        int moreNumbers[] = {4,5,6};
//        numbers[1] = numbers[1] + 1;
//        System.out.println("Physics: " +  marks[0]);
//        System.out.println("Chemistry: " +  marks[1]);
//        System.out.println("Maths: " +  marks[2]);
//        System.out.println("Statistics: " +  marks[3]);
//        System.out.println("Percentage: " + percentage + "%" );
//    }
//
//}




//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            //Size input
//            System.out.print("Size of an Array:");
//            int size = sc.nextInt();
//            //declare array
//            int[] numbers = new int[size];
//            for(int i=0;i<size;i++){
//                //number input
//                System.out.print("Index" + i + ":");
//                numbers[i] = sc.nextInt();
//            }
//
//            //input for finding value
//            System.out.print("Search index at:");
//            int x = sc.nextInt();
//            //output
//            for(int i=0;i< numbers.length;i++){
//                if(numbers[i] == x ){
//                    System.out.println("x found at index:" + i);
//                }
//            }
//        }
//    }
