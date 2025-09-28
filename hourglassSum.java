//HACKERRANK 2D Array - DS

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class hourglassSum {
    public static void main(String[] args) {
        List<List<Integer>> exampleList = new ArrayList<>();

        exampleList.add(new ArrayList<>(Arrays.asList(1, 1, 1, 0, 0, 0)));
        exampleList.add(new ArrayList<>(Arrays.asList(0, 1, 0, 0, 0, 0)));
        exampleList.add(new ArrayList<>(Arrays.asList(1, 1, 1, 0, 0, 0)));
        exampleList.add(new ArrayList<>(Arrays.asList(0, 0, 2, 4, 4, 0)));
        exampleList.add(new ArrayList<>(Arrays.asList(0, 0, 0, 2, 0, 0)));
        exampleList.add(new ArrayList<>(Arrays.asList(0, 0, 1, 2, 4, 0)));

        System.out.println(hgSum(exampleList));
    }

    public static int hgSum(List<List<Integer>> arr){
        int max = Integer.MIN_VALUE;

        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 5; j++){
                int total = arr.get(i-1).get(j-1) + arr.get(i-1).get(j) + arr.get(i-1).get(j+1) + arr.get(i).get(j) + arr.get(i+1).get(j-1) + arr.get(i+1).get(j) + arr.get(i + 1).get(j+1);
            
                if(total > max){
                    max = total;
                }
            }
        }

        return max;
    }
}