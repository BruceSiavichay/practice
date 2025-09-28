//HACKERRANK New Year Chaos

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class newYearChaos {
    public static void main(String[] args) {
        List<Integer> exampleList = new ArrayList<>(Arrays.asList(2, 1, 5, 3, 4));

        minimumBribes(exampleList);
        exampleList = Arrays.asList(2, 5, 1, 3, 4);
        minimumBribes(exampleList);
    }

    public static void minimumBribes(List<Integer> q){
        int bribes = 0;

        for(int i = q.size() - 1; i >= 0; i--){
            int difference = q.get(i) - (i + 1);

            if(difference > 2){
                System.out.println("Too chaotic");
                return;
            }

            //Subtracting by 2 is a clever shortcut because we don't need to check more than 2 spots ahead.
            //Example: 4 at end of array. Initial position would have been in 4th place (1-indexed). If person bribes them, then 4 is in 5th place and that number is in 4th. If that number bribes again they would be in third, or index 2 (and q.get(i) - 2 would be 2).
            //Also the Math.max(0) is a safety measure because if the number is 1, then q.get(i) - 2 would be -1 and we can't index that so we just do 0.
            for(int j = Math.max(0, q.get(i) - 2); j < i; j++){
                if(q.get(j) > q.get(i)){
                    bribes++;
                }
            }

        }

        System.out.println(bribes);
    }
}
