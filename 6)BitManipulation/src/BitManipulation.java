import java.util.*;
public class BitManipulation {
    public static void main(String[] args) {

    }
}










       // Fast Exponantiation
//    public static int fastExpo(int a,int n){
//        int ans = 1;
//        while(n>0){
//            if((n&1) != 0){
//                ans = ans * a;
//            }
//            a = a * a;
//            n = n>>1;
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        System.out.println(fastExpo(3,5));
//    }
//}






        // Count Set bit
//    public static int setBitInNumber(int n){
//        int count = 0;
//        while(n >0){
//            if((n & 1) !=0){
//                count ++;
//            }
//           n = n >>1;
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        System.out.println(setBitInNumber(15));
//    }
//}


           /// Check if a number is power of two
//    public static  boolean isPowerOfTwo(int n){
//        return  (n & (n-1)) == 0;
//    }
//    public static void main(String[] args) {
//        System.out.println(isPowerOfTwo(8));
//    }
//}




        // Clear the range of bit
//    public static  int clearRangeOfBits(int n,int i,int j){
//        int a = (~0)<<j+1;
//        int b = (1<<i) -1;
//        int bitmask = a|b;
//        return n & bitmask;
//    }
//    public static void main(String[] args) {
//        System.out.println(clearRangeOfBits(10,2,4));
//    }
//}


         // Clear last bit
//    public static int clearLastBit(int n,int i){
//        int bitMask = (~0)<<i;
//        return n & bitMask;
//    }
//    public static void main(String[] args) {
//        System.out.println(clearLastBit(15,2));
//    }
//}





            // Update Bit
//    public static int   clearBit(int n,int i) {
//       int bitmask = 1 << i;
//      int cleaBit = ~bitmask & n;
//      return cleaBit;
//   }
//
//    public static int  setBit(int n,int i) {
//           int bitmask = 1 << i;
//         int seBit = bitmask | n;
//         return seBit;
//        }
//    public static int updateBit(int n,int i,int newBit){
//        if(newBit == 0){
//            return clearBit(n,i);
//        }else{
//            return setBit(n,i);
//        }
//    }
//    public static void main(String[] args) {
//        int n = 10;
//        int i = 1;
//        int newBit = 0;
//        System.out.println(updateBit(n,i,newBit));
//    }
//}






//    //  Clear bit
//    public static void  clearBit(int n,int i) {
//
//        int bitmask = 1 << i;
//        int cleaBit = ~bitmask & n;
//        System.out.println(cleaBit);
//    }
//    public static void main(String[] args) {
//        int n = 10;
//        int i = 1;
//        clearBit(n,i);
//    }
//}






    // Set Bit
//        public static void  setBit(int n,int i) {
//
//            int bitmask = 1 << i;
//            int seBit = bitmask | n;
//            System.out.println(seBit);
//        }
//    public static void main(String[] args) {
//        int n = 10;
//        int i = 2;
//        setBit(n,i);
//    }
//    }





    // Get Bit
//    public static void  getBit(int n,int i){
//
//        int bitmask = 1 << i;
//        if((bitmask & n) == 0){
//            System.out.println("bit was zero");
//        }else{
//            System.out.println("bit was one");
//        }
//    }
//    public static void main(String[] args) {
//        int n = 10;
//        int i = 3;
//        getBit(n,i);
//    }
//}




            // odd or even
//    public static void oddOrEven(int n){
//        int bitMask = 1;
//        if((n & bitMask) == 0){
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }
//    }
//    public static void main(String[] args) {
//    oddOrEven(91);
//    }
//}





//
//    public static void main(String[] args) {
////        //AND
////        System.out.println(5&6);
////        // OR
////        System.out.println(5|6);
////        //XOR
////        System.out.println(5^6);
//        // NOT
////        System.out.println(~5);
//
////        /// binary left shift
////        System.out.println(5<<2);
//        // binary right shift
////        System.out.println(6>>1);
//
//    }
//}
