import java.util.HashMap;

public class introductionHashMap {
    public static void main(String[] args) {
        String str="abcdeagaf";
        int n=str.length();
        //Arrays implementation
        int [] arr=new int[n];
        /*for (int i = 0; i < n; i++) {
            char ch=str.charAt(i);
            arr[ch-'a']++;
        }*/

        //another Arrays implementation
      /*  int maxFreq=0;
        char ans=' ';
        for (int i = 0; i < 26; i++) {
            if(maxFreq<arr[i]){
                maxFreq=arr[i];
                ans = (char) ('a'+ i);
            }
        }*/

        //hashMap syntax
        /*1.HashMap<Character/String/Node/Integer, Integer/...> hm=new HashMap<>();
          2.hm.put(key,value)
          3.hm.get(key)  ->outputs: value @key
          4.hm.size()
          5.containsKey(key) ->outputs: True or False
         */
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if (hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
                hm.put(ch, 1);
            }
        }
    }
}
