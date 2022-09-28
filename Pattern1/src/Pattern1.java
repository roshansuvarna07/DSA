public class Pattern1 {
    public static void main(String[] args) {
        ////////Print Character pattern
        int n = 5;
        char ch = 'A';
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        ////////Print number pattern
       /* int n = 5;
        int numb = 1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(numb + " ");
                numb++;
            }
            System.out.println();
        }*/
//        ////// print Half pyramid pattern
//        int n = 5;  // 1 to n
//        for(int i = 1;i<=n;i++){//  i represents no. of the line (i---->line)
//            for(int j = 1;j<=i;j++){   // j represents no. of the stars (j---->stars)
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        //////PATTERN INVERTED STAR pattern
       /* int n = 5;  // n - i + 1 approach
        for (int i = 1; i <= n; i++) {//  i represents no. of the line (i---->line)
            for (int j = 1; j <= n - i + 1; j++) {   // j represents no. of the stars (j---->stars)
                System.out.print(" * ");
            }
            System.out.println();
        }*/
        //////PATTERN INVERTED STAR pattern
        /*int n = 5;  // n to 1 approach
        for (int i = n; i >= 1; i--) {//  i represents no. of the line (i---->line)
            for (int j = 1; j <= i; j++) {   // j represents no. of the stars (j---->stars)
                System.out.print(" * ");
            }
            System.out.println();
        }*/
            //////STAR PATTERN
       /* int n = 5;  // 1 to n
        for(int i = 1;i<=n;i++){//  i represents no. of the line (i---->line)
            for(int j = 1;j<=i;j++){   // j represents no. of the stars (j---->stars)
                System.out.print(" * ");
            }
            System.out.println();
        }*/

    }
}

