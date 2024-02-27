import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        String[] arrS = s.split("[!,?._ '@]+");
        
        int num = arrS.length;
        //if(arrS == null){
        if(s.siEmpty()){
            System.out.println(0);
        }else{
            System.out.println(num);
        }
        for(int i = 0; i < arrS.length; i++){
            System.out.println(arrS[i]);
        }
        scan.close();
    }
}

