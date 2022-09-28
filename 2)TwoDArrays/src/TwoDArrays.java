import java.util.*;
public class TwoDArrays {
//    public static void main(String[] args) {
//         int nums [][] ={{1,4,9},{11,4,3},{2,2,3}};
//         int sum =0;
//         for(int i=0; i< nums.length;i++){
//             for (int j=0;j<nums[0].length;j++){
//                 if(i ==1 && i+j-1==j){
//                     sum += nums[i][j];
//                 }
//             }
//         }
//         System.out.println(sum);
//     }
// }

        /// Solution 1
//    public static void main(String[] args) {
//        //int matrix[][] = {{4, 7, 8}, {8, 8, 7}};
////        int key = 7;
////        int sum = 0;
////        for (int i = 0; i < matrix.length; i++) {
////            for (int j = 0; j < matrix[0].length; j++) {
////                if (key == matrix[i][j]) {
////                    sum++;
////                }
////            }
////        }
////        System.out.println(sum);
//    }
//}


        /////   //  Search for Sorted Array (Bottom to Top)
//    public static boolean stairCaseSearch(int matrix[][],int key){
//        int row = matrix.length -1,col=0;
//        while(col < matrix[0].length && row >=0){
//            if(matrix[row][col] == key){
//                System.out.println("Key found at index " + "(" + row + ","+ col + ")");
//                return true;
//            }else if(key < matrix[row][col]){
//                row --;
//            }else{
//                col++;
//            }
//        }
//        System.out.println("key not found");
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int matrix[][] = {{10,20,30,40},
//                {15,25,35,45},
//                {27,29,37,48},
//                {32,33,39,50}};
//        int key =35;
//        stairCaseSearch(matrix,key);
//
//    }
//
//}


        //  Search for Sorted Array (Top to Bottom)
//    public static boolean stairCaseSearch(int matrix[][],int key){
//        int row = 0,col=matrix[0].length -1;
//        while(row < matrix.length && col >=0){
//            if(matrix[row][col] == key){
//                System.out.println("Key found at index " + "(" + row + ","+ col + ")");
//               return true;
//            }else if(key < matrix[row][col]){
//                col --;
//            }else{
//                row++;
//            }
//        }
//        System.out.println("key not found");
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int matrix[][] = {{10,20,30,40},
//                          {15,25,35,45},
//                          {27,29,37,48},
//                          {32,33,39,50}};
//        int key =33;
//      stairCaseSearch(matrix,key);
//
//      }
//
//    }


        // Diagonal sum
//    public static int diagonalSum(int matrix[][]){
//        int sum =0;
//        // brute force approach (O[n^2])
////        for(int i= 0; i<matrix.length; i++){
////            for (int j =0 ; j<matrix.length ;j++){
////                if(i == j){
////                    sum += matrix[i][j];
////                }else if (i + j == matrix.length-1){
////                    sum += matrix[i][j];
////                }
////            }
////        }
//        // Optimized Approach (O[n])
//        for(int i= 0; i<matrix.length; i++){
//            sum += matrix[i][i];
//            sum += matrix[i][matrix.length-i-1];
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        int matrix[][] ={ {1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        System.out.println(diagonalSum(matrix));
//    }
//}


        //// Spiral Matrix
        public static void spiralMatrix ( int matrix[][]){
            int startRow = 0;
            int endRow = matrix.length - 1;
            int startCol = 0;
            int endCol = matrix[0].length - 1;

            while (startRow <= endRow && startCol <= endCol) {

                // Top boundry
                for (int j = startCol; j <= endCol; j++) {
                    System.out.print(matrix[startRow][j] + " ");
                }

                // Right boundry
                for (int i = startRow + 1; i <= endRow; i++) {
                    System.out.print(matrix[i][endCol] + " ");
                }

                // Bottom boundry
                for (int j = endCol - 1; j >= startCol; j--) {
                    if (startCol == endCol) {
                        break;
                    }
                    System.out.print(matrix[endRow][j] + " ");
                }

                //  Left boundry
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    if (startRow == endRow) {
                        break;
                    }
                    System.out.print(matrix[i][startCol] + " ");
                }
                startRow++;
                startCol++;
                endRow--;
                endCol--;
            }
            System.out.println();
        }
        public static void main (String[]args){
            int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
            spiralMatrix(matrix);
        }
    }









/////////////// Search the given key
//    public static void Search(int matrix[][],int key){
//        for(int i=0;i <matrix.length;i++){
//            for(int j =0 ;j < matrix[0].length;j++){
//                if(matrix[i][j] == key){
//                    System.out.println("Key found at index " + "(" + i + "," + j + ")");
//                }
//            }
//        }
//        System.out.println("key not found");
//    }

//    public static void main(String[] args) {
//        int matrix[][] = new int [3][3];
//        int n = matrix.length, m = matrix[0].length;
//        Scanner sc = new Scanner(System.in);
//        // Input
//        for(int i = 0;i <n;i++){ /// Rows
//            for(int j = 0; j<n ;j++) {    // Columns
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        // Output
//        for(int i = 0;i <n;i++){ /// Rows
//            for(int j = 0; j<m ;j++) {    // Columns
//                System.out.print( matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        Search(matrix,3);
//    }
// }
