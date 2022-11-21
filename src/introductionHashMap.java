//Theory
/*
*used in development especially data
* why? -> makes functions Insert/Search/Delete less Time Complexity compared to other Data Structures
*further research to be carried out
 */


//counting frequency of stuff, case 1 of characters in a string
import java.util.HashMap;

public class introductionHashMap {
    public static void main(String[] args) {
        String str="abcdeagaf";
        int n=str.length();
        //Arrays implementation
        int [] arr=new int[n];
        //Part one
        /*for (int i = 0; i < n; i++) {
            char ch=str.charAt(i);
            arr[ch-'a']++;
        }*/



        //hashMap syntax
        /*1.HashMap<Character/String/Node/Integer(value), Integer(key)/...> hm=new HashMap<>();
          2.hm.put(key,value)
          3.hm.get(key)  ->outputs: value @key
          4.containsKey(key) ->outputs: True or False
         */
        //Part One
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if (hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
                hm.put(ch, 1);
            }
        }
        //explanation for above code
        /*if(check whether key is already present){
             int old_value=hm.get(ch);
             hm.put(ch, old_value+1);
             }else{
             hm.put(ch, 1);
             }
             */
/*
*
*
*/

        //another Arrays implementation
      /*  int maxFreq=0;
        char ans=' ';
        for (int i = 0; i < 26; i++) {
            if(maxFreq<arr[i]){
                maxFreq=arr[i];
                ans = (char) ('a'+ i);
            }
        }*/
        //above in hashMap or Part two

        int maxFreq=0;
        char ans=' ';
        for(Character ch: hm.keySet()){//this will iterate over all the keys
            if (maxFreq<hm.get(ch)){
                maxFreq=hm.get(ch);
                ans=ch;
            }
        }
        System.out.println(ans+" "+maxFreq);
    }
}
