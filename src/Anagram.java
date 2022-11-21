//link___https://leetcode.com/problems/valid-anagram/
        //store frequency of array
        //check if frequencies match
        //Using Arrays
/*
        static boolean anagram(String str1, String str2) {
            int n=str1.length();
            int m=str2.length();
            if (n!=m) return false;

            int [] arr=new int[26];
            int [] brr=new int[26];

            for (int i = 0; i < n; i++) {
                char ch1=str1.charAt(i);
                char ch2=str2.charAt(i);

                arr[ch1-'a']++;
                arr[ch2-'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (arr[i]!=brr[i]) return false;

            }
            return true;
        }
*/


        //Using Hash Map
/*
       static boolean anagram(String str1, String str2) {
            int n=str1.length();
            int m=str2.length();
            if (n!=m) return false;

            //int [] arr=new int[26];
            HashMap <Character,Integer> hm1=new HashMap<>();

            //int [] brr=new int[26];
            HashMap <Character,Integer> hm2=new HashMap<>();

            for (int i = 0; i < n; i++) {
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);

            //arr[ch1-'a']++;
            if (hm1.containsKey(ch1)) hm1.put(ch1, hm1.get(ch1)+1);
            else hm1.put(ch1,1);

            //arr[ch2-'a']++;
            if (hm2.containsKey(ch2)) hm2.put(ch2, hm2.get(ch2)+1);
            else hm2.put(ch2,1);
            }
            return hm1.equals(hm2);
            }
*/
