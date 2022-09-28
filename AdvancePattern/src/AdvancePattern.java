public class AdvancePattern {
    public static void main(String[] args) {

    }
}
//    public static void butterfly_pattern(int n){
//        // outer loop for 1st half
//        for (int i = 1;i <= n;i ++){
//            // 1st star
//            for(int j = 1;j <= i;j ++){
//                System.out.print(" * ");
//            }
//            // space
//            for(int j = 1;j <= 2*(n-i);j ++){
//                System.out.print("   ");
//            }
//            //2nd star
//            for(int j = 1;j <= i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }// End of outer loop for 1st half
//
//       // outer loop for 2nd half
//        for (int i = n;i >= 1;i --){
//            // 1st star
//            for(int j = 1;j <= i;j ++){
//                System.out.print(" * ");
//            }
//            // space
//            for(int j = 1;j <= 2*(n-i);j ++){
//                System.out.print("   ");
//            }
//            //2nd star
//            for(int j = 1;j <= i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }// End of outer loop for 2nd half
//    }
//    public static void main(String[] args) {
//        butterfly_pattern(4);
//    }
//}




//    public  static  void zero_one_triangle(int n){
//        // outer loop
//        for(int i=1;i<=n;i++){
//            // inner loop
//            for(int j=1;j<= i;j++){
//                int sum = i+j;
//                if(sum % 2==0) { // even
//                    System.out.print("1" + " ");
//                }else{//odd
//                    System.out.print("0" + " ");
//                }
//            } // closing inner loop
//            System.out.println();
//        } // closing outer loop
//    }
//    public static void main(String[] args) {
//        zero_one_triangle(5);
//    }
//}


//    public  static  void floyds_triangle(int n){
//        int number = 1;
//        // outer loop
//        for(int i=1;i<=n;i++){
//            // inner loop
//            for(int j=1;j<= i;j++){
//                System.out.print(number + " ");
//                number ++;
//            } // closing inner loop
//            System.out.println();
//        } // closing outer loop
//    }
//    public static void main(String[] args) {
//        floyds_triangle(5);
//    }
//}





//    public  static  void  inverted_half_pyramid_withNumber(int n){
//        // outer loop
//        for(int i=1;i<=n;i++){
//            // inner loop
//            for(int j=1;j<= n-i+1;j++){
//                System.out.print(j + " ");
//            } // closing inner loop
//            System.out.println();
//        } // closing outer loop
//    }
//    public static void main(String[] args) {
//        inverted_half_pyramid_withNumber(5);
//    }
//}




//    public  static void hollow_rhombus(int n,int m){
//        // outer loop
//        for(int i = 1;i <= n;i ++){
//            // spaces
//            for(int j = 1;j <= n-i;j++){
//                System.out.print("   ");
//            }
//            for(int j =1;j <= m;j++){
//                // cell - (i,j)
//                if(i == 1 || i == n || j == 1 || j == m){
//                    System.out.print(" * ");
//                }else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        hollow_rhombus(4,5);
//    }
//}



//    public  static void inverted_rotated_half_pyramid(int n){
//        // outer loop
//        for(int i = 1;i <= n;i ++){
//            // spaces
//            for(int j = 1;j <= n-i;j++){
//                System.out.print("   ");
//            }
//
////            // star
//            for(int j =1;j <= i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        inverted_rotated_half_pyramid(10);
//    }
//}




//    public  static void hollow_rectangle(int totRows,int totCols){
//        // outer loop
//        for(int i=1;i <= totRows; i++){
//            // inner loop
//            for(int j =1;j <= totCols;j++){
//                // cell - (i,j)
//                if(i == 1 || i == totRows || j == 1 || j == totCols){
//                    System.out.print(" * ");
//                }else{
//                    System.out.print("   ");
//                }
//            } // inner loop close
//            System.out.println();
//        }  // outer loop close
//    }
//    public static void main(String[] args) {
//        hollow_rectangle(4,5);
//    }
//}
