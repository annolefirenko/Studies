import sorters.BubbleSorter;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] newArray = new int[n];
        for (int i = 0; i < n; i++){
            newArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(BubbleSorter.sort(newArray)));
        System.out.println(Arrays.toString(BubbleSorter.optimizedSort(newArray)));
    }
}
