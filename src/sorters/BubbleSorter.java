package sorters;

public class BubbleSorter {
    public static int[] sort(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
                counter++;
            }
        }
        System.out.println("We've made " + counter + " comparations");
        return array;
    }

    public static int[] optimizedSort(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i-1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
                counter++;
            }
        }
        System.out.println("We've made " + counter + " comparations");
        return array;
    }
}