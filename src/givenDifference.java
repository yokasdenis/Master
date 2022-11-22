//link____https://course.acciojob.com/idle?question=803b4abc-3829-4b3b-9dab-74da720ff06a

//intial logic using Arrays
/*
for(i=0 to n){
    for(j=i+1 to n){
        if(abs(arr[i]-arr[j])==k) return 1;
        }
     }
return 0;
*/


import java.util.*;

class Solution {
    public int givenDifference(int []arr, int n, int k) {
HashMap<Integer,Integer>hm=new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(hm.containsKey(arr[i]+k) || hm.containsKey(arr[i]-k))return 1;
            hm.put(arr[i],1);
        }
        return 0;
    }
}

public class givenDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,B;
        n = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        B = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.givenDifference(mat,n,B));
        System.out.println('\n');
    }
}
