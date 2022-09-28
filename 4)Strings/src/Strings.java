import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greet = sc.next();
        int start = sc.nextInt();
       int  end =sc.nextInt();
        String subgreet = greet.substring(start,end);
        System.out.println(subgreet);
    }
}





//    public static String compress(String str){
//        String newstr = "";
//        for(int i=0;i<str.length();i++){
//            Integer count = 1; // Integer is taken because to convert in string
//            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                count ++;
//                i++;
//            }
//            newstr += str.charAt(i);
//            if(count > 1){
//                newstr += count.toString();
//            }
//        }
//        return  newstr;
//    }
//    public static void main(String[] args) {
//        String str = "aaabbcccdd";
//        System.out.println(compress(str));
//    }
//}



       //// joining the character 0 (n^2)
//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("");
//        for(char ch = 'a'; ch <= 'z'; ch++){
//            sb.append(ch);
//        }
//
//    }
//}






//    public static void main(String[] args) {
//        String fruits[] = {"apple","mango","banana"};
//        String largest = fruits[0];
//        for (int i=0;i<fruits.length;i++){
//            if(largest.compareTo(fruits[i])<0){
//                largest = fruits[i];
//            }
//        }
//        System.out.println(largest);
//    }
//}





//    public static String subString(String str,int si,int ei){
//        String substr = "";
//        for (int i=si;i<ei;i++){
//            substr += str.charAt(i);
//        }
//        return  substr;
//    }
//    public static void main(String[] args) {
//        String str = "HelloWorld";
//        System.out.println(str.substring(0,5));// inbuilt function
//        System.out.println(subString(str,0,5));
//    }
//}






    /// Shortest path
//    public static float getShortestPath(String path){
//        int x = 0,y=0;
//        for(int i =0 ; i < path.length();i++){
//            char direction = path.charAt(i);
//            // south
//            if(direction == 'S'){
//                y--;
//                //north
//            } else if (direction == 'N') {
//                y++;
//                //east
//            }else if(direction == 'E'){
//                x++;
//                //west
//            }else{
//                x--;
//            }
//        }
//        int X2 = x*x;
//        int Y2 = y*y;
//        return (float)Math.sqrt(X2 + Y2);  // we have type casted into Float because Math function does not take integer data type
//    }
//    public static void main(String[] args) {
//        String path = "WNEENESENNN";
//        System.out.println(getShortestPath(path));
//    }
//}



          // palindrome
//    public static  boolean isPalindrome(String str){
//        int n = str.length();
//        for(int i=0;i<str.length()/2;i++){
//            if(str.charAt(i) != str.charAt(n-i-1)){
//                return false;
//            }
//        }
//       return true;
//    }
//    public static void main(String[] args) {
//        String str = "roshan";
//        System.out.println(isPalindrome(str));
//    }
//}





//    public static  void printLetter(String fullName){
//        for(int i =0; i<fullName.length();i++){
//            System.out.print(fullName.charAt(i) + " ");
//        }
//    }
//    public static void main(String[] args) {
//        // concatenation
//        String firstName = "Roshan";
//        String lastName = "Suvarna";
//        String fullName = firstName + " " + lastName;
////        System.out.println(fullName);
//        printLetter(fullName);
//    }
//}
