//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] a) {
        // Code Here
        int largest=a[0];
        int slargest=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                slargest=largest;
                largest=a[i];
            }
            else if(a[i]<largest&&a[i]>slargest){
                slargest=a[i];
            }
        }
        return slargest;
    }
}