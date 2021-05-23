import HackerRank.GridSearch;

public class Main {
    public static void main(String[] args){
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] newArray = new int[n];
        for (int i = 0; i < n; i++){
            newArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(BubbleSorter.sort(newArray)));
        System.out.println(Arrays.toString(BubbleSorter.optimizedSort(newArray)));
        CounterThread counter = new CounterThread();
        counter.start();
        Thread charCounter = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 97; i < 103; i++) {
                    System.out.println((char)i);
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        charCounter.start();*/
        GridSearch.solve();
    }
}
