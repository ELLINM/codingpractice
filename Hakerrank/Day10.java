import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        
        int square = B*H;
        if(square > 0){
            System.out.print(square);
        }else{
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
        
    }
}

/*
Error Test Case 
if H and B is negative 
if H or B is Zero
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        
        int square = B*H;
        if(B > 0 && H > 0){
            System.out.print(square);
        }else if(B <= 0 || H <= 0){
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }        
    }
}
