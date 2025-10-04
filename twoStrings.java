//HACKERRANK Two Strings
import java.util.HashMap;

public class twoStrings {
    public static void main(String[] args) {
        System.out.println(twoStringsFunction("hi", "world"));
        System.out.println(twoStringsFunction("hello", "world"));
    }

    public static String twoStringsFunction(String s1, String s2){
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            hm.put(s1.charAt(i), hm.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for(int j = 0 ; j < s2.length(); j++){
            int count = hm.getOrDefault(s2.charAt(j), 0);
            if(count >= 1){
                return "YES";
            }
        }

        return "NO";
    }
}
