//HACKERRANK Arrays: Left Rotation

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class leftRotation {
    public static void main(String[] args) {
        List<Integer> exampleList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(rotLeft(exampleList, 4));
    }

    public static List<Integer> rotLeft(List<Integer> a, int d){
        int rotations = d % a.size();
        List<Integer> newList = new ArrayList<>(Collections.nCopies(a.size(), 0));

        for(int i = 0; i < a.size(); i++){
            newList.set((i - rotations + a.size()) % a.size(), a.get(i));
        }

        return newList;
    }
}
