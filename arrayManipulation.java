//HACKERRANK Array Manipulation

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayManipulation {
    public static void main(String[] args) {
        List<List<Integer>> testList = new ArrayList<>();

        testList.add(new ArrayList<>(Arrays.asList(1, 2, 100)));
        testList.add(new ArrayList<>(Arrays.asList(2, 5, 100)));
        testList.add(new ArrayList<>(Arrays.asList(3, 4, 100)));

        System.out.println(arrayManipulationFunc(5, testList));
    }
    
    public static long arrayManipulationFunc(int n, List<List<Integer>> queries){
        // brute force solution was O(n*m) so it failed some cases
        // the real solution uses the "prefix sum algorithm"
        // where every element of the array is set to that element + all previous elements
        // but we are only adding to a specific range, so anything after the array is -k to neutralize it
        // we made the array n+1 size for convenience because it's 1-indexed
        // then made it n+2 size because of b+1 and anything after b gets subtracted by k
        // when the prefix sum algorithm is then applied, the resulting array is the array after all operations are performed
        // there's a great video by javaaid that goes in depth

        List<Integer> exampleList = new ArrayList<>(Collections.nCopies(n+2, 0));

        for(int i = 0; i < queries.size(); i++){
            int a = queries.get(i).get(0);
            int b = queries.get(i).get(1);
            int k = queries.get(i).get(2);

            exampleList.set(a, exampleList.get(a) + k);
            exampleList.set(b+1, exampleList.get(b+1) - k);
        }

        long max = Long.MIN_VALUE;
        long sum = 0;

        for(int j = 0; j < exampleList.size(); j++){
            sum += exampleList.get(j);
            max = Math.max(max, sum);
        }

        return max;
    }
}
