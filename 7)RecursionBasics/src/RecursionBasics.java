import java.util.Scanner;

public class RecursionBasics {
}




               // Number occured in All Index
//    public static int AllOcc(int arr[],int key, int i){
////        // base case
//        if(i == arr.length){
//            return -1;
//        }
//        if(arr[i] == key){
//            System.out.print(i + " "); ;
//        }
//        return AllOcc(arr,key,i +1);
//    }
//    public static void main(String[] args) {
//        int arr[] = {3,2,4,5,6,2,7,2,2};
//        int key = 2;
//        int i = 0;
//       AllOcc(arr,key,i);
//
//    }
//}






    ///////// Pairing friends
//    public static int pairingFrnds(int n){
//        // base case
//        if(n == 1 || n == 2){
//            return n;
//        }
//        // WORK TO DO:
//             // Single
//        int fnm1 = pairingFrnds(n -1);
//             // pairs
//        int fnm2 =  (n - 1) * pairingFrnds(n - 2);
//
//        int totalWays = fnm1 + fnm2;
//        return totalWays;
//    }
//    public static void main(String[] args) {
//        int n = 3;
//        System.out.println(pairingFrnds(n));
//    }
//}











    //////////// Tiling Problem
//    public static int tilingProblem(int n){ // for floor ( 2 X n )
//        // base case
//        if(n == 0 || n == 1){
//            return 1;
//        }
//
//        //   WORK TO DO:
//             // vertical choice
//        int fnm1 = tilingProblem(n - 1);
//            // horizontal choice
//        int fnm2 = tilingProblem(n - 2);
//
//        int totalWays = fnm1 + fnm2;
//        return  totalWays;
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        System.out.println("Number of ways for tiling 2 x  " + n + " is " + tilingProblem(n));
//    }
//}













    /////////// print x^n (Optimed)    O(log n)
//    public static int optimizedPower(int x,int n){
//        // base case
//        if(n == 0){
//            return  1;
//        }
//
//        int halfPower = optimizedPower(x,n/2);
//        int halfPowerSquare = halfPower * halfPower;
//
//        // if n is odd
//        if(n % 2 != 0) {
//            halfPowerSquare = x * halfPowerSquare;
//        }
//        return  halfPowerSquare;
//    }
//    public static void main(String[] args) {
//        System.out.println(optimizedPower(2,10));
//    }
//}




         /// Print x^n      O(n)
//    public static int xPow(int x,int n){
//        // base case
//        if(n == 1){
//            return  x;
//        }
//        int xnm1 = xPow(x,n-1);
//        int xn = x * xnm1;
//        return  xn;
//    }
//    public static void main(String[] args) {
//        int x = 2;
//        int n = 10;
//        System.out.println(xPow(x,n));
//    }
//}







           ///// Last Occurance
//    public static int lastOcc(int arr[],int key, int i){
//        // base case
//        if(i == arr.length){
//            return -1;
//        }
//        int isFound = lastOcc(arr,key,i + 1);
//        if(arr[i] == key && isFound == -1){
//            return i;
//        }
//        return isFound;
//    }
//    public static void main(String[] args) {
//        int arr[] = {8,3,6,9,5,10,2,5,3};
//        int key = 5;
//        int i = 0;
//        int fo = lastOcc(arr,key,i);
//        if(fo == -1){
//            System.out.println("key not found");
//        }else{
//            System.out.println("key found at index " + fo);
//        }
//    }
//}










    /////// First Occurance
//    public static int firstOcc(int arr[],int key, int i){
//        // base case
//        if(i == arr.length){
//            return -1;
//        }
//        if(arr[i] == key){
//            return i;
//        }
//        return firstOcc(arr,key,i +1);
//    }
//    public static void main(String[] args) {
//        int arr[] = {8,3,6,9,5,10,2,5,3};
//        int key = 5;
//        int i = 0;
//       int fo = firstOcc(arr,key,i);
//       if(fo == -1){
//           System.out.println("key not found");
//       }else{
//           System.out.println("key found at index " + fo);
//       }
//    }
//}





         // Check Array is Sorted or Not
//    public static  boolean isSorted(int arr[], int i){
//        if(i == arr.length -1){
//            return true;
//        }
//        if(arr[i] > arr[i +1]){
//            return  false;
//        }
//      return  isSorted(arr, i +1);
//    }
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        int i = 0;
//        System.out.println(isSorted(arr,i));
//    }
//}





         ///// print Nth fibbonaci no.
//    public  static  int fibonacci(int n){
//        if( n ==0 || n == 1){
//            return  n;
//        }
//       int fnm1 = fibonacci(n -1);
//        int fnm2 = fibonacci(n -2);
//        int fn = fnm1 + fnm2;
//        return fn;
//    }
//    public static void main(String[] args) {
//        int n = 30;
//        System.out.println(fibonacci(n));
//    }
//}










        ///// Sum of n Natural number
//    public static  int sum(int n){
//        // base case
//        if(n == 1){
//            return  1;
//        }
//        int snm1 = sum(n - 1);
//        int sn = n + snm1;
//        return sn;
//    }
//    public static void main(String[] args) {
//        int n = 10 ;
//
//        System.out.println( sum(n));
//    }
//}








    /////////// factorial of given no.
//    public static  int fact(int n){
//        // base case
//        if(n == 0){
//            return  1;
//        }
//        int fnm1 = fact(n - 1);
//        int fn = n * fnm1;
//        return fn;
//    }
//    public static void main(String[] args) {
//        int n = 10;
//
//        System.out.println( fact(n));
//    }
//}





    //// print no. in increasing order
//    public static  void printIncreasing(int n){
//        if(n == 1){
//            System.out.print(n + " ");
//            return;
//        }
//        printIncreasing(n - 1);
//        System.out.print(n + " ");
//
//    }
//    public static void main(String[] args) {
//        int n = 10;
//        printIncreasing(n);
//    }
//}






    ////////  print no. in decreasing order

//    public static  void printDecreasing(int n){
//        if(n == 1){
//            System.out.println(n);
//            return;
//        }
//        System.out.print(n + " ");
//        printDecreasing(n - 1);
//    }
//    public static void main(String[] args) {
//        int n = 10;
//        printDecreasing(n);
//    }
//}
