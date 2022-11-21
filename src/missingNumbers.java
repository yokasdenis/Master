import java.util.Scanner;

//link__ https://course.acciojob.com/idle?question=560ab8d1-ed6f-45e0-b3be-a0d1c1d56499
public class missingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] brr = new int[m];
        for (int i = 0; i < m; i++) {
            brr[i] = scanner.nextInt();
        }
        Solution obj = new Solution();
        obj.missingNumber(arr,brr);
    }
}

    class Solution {
        static void missingNumber(int[] arr, int[] brr) {
            int n = arr.length;
            int m = brr.length;
            int[] cnt1 = new int[10001];
            int[] cnt2 = new int[10001];
            for (int i : arr) cnt1[i]++;
            for (int j : brr) cnt2[j]++;

            for (int i = 0; i <= 10000; i++) {
                //present in 2nd Array not in 1st
                if (cnt1[i] == 0 && cnt2[i] > 0) System.out.print(i + " ");
                    //if it is present in both arrays then frequency is not same
                else if (cnt1[i] > 0 && cnt2[i] > 0 && cnt1[i] != cnt2[i]) System.out.print(i + " ");
            }
            //System.out.println();
        }
    }
