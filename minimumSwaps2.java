//HACKERRANK MINIMUM SWAPS 2

public class minimumSwaps2 {
    public static void main(String[] args) {
        int[] example = {4, 3, 1, 2};

        System.out.println(minimumSwaps(example));
    }

    public static int minimumSwaps(int[] arr){
        int swaps = 0;
        int i = 0;

        while(i < arr.length){
            if(arr[i] != i+1){
                int j = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swaps++;
            }else{
                i++;
            }
        }

        return swaps;
    }
}
