//HACKERRANK Ransom Note

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ransomNote {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("give", "me", "one", "grand", "today", "night"));
        List<String> list2 = new ArrayList<>(Arrays.asList("give", "one", "grand", "today"));

        checkMagazine(list1, list2);
    }

    public static void checkMagazine(List<String> magazine, List<String> note){
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < note.size(); i++){
            hm.put(note.get(i), hm.getOrDefault(note.get(i), 0) + 1);
        }

        for(int j = 0; j < magazine.size(); j++){
            hm.put(magazine.get(j), hm.getOrDefault(magazine.get(j), 0) - 1);
        }

        boolean ransomSuccess = true;
        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            if(entry.getValue() > 0){
                ransomSuccess = false;
            }
        }

        if(ransomSuccess){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
