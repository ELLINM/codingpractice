import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String[] A = a.toLowerCase().split("");
        String[] B = b.toLowerCase().split("");
        
        java.util.Arrays.sort(A);
        java.util.Arrays.sort(B);
        if(A.length != B.length){
            return false;
        }
        for(int i = 0; i < A.length; i++){
            if(!A[i].equals(B[i])){
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

/*
If the lengths are different, it is not checked.
So add the related IF statement
*/
