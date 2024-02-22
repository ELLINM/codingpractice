import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.List<String> arr = new java.util.ArrayList<String>();
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<=s.length()-k;i++){
            String str = s.substring(i,i+k);
            arr.add(str);
        }        

        java.util.Collections.sort(arr);

        return arr.get(0)+"\n"+arr.get(arr.size()-1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
