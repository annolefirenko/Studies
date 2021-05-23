package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class ClimbingTheLeaderBoard {

    public static void solve() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//number of players in ranked list
        int[] ranked = new int[n];
        for(int i=0; i < n; i++){
            ranked[i] = in.nextInt();
        }
        int m = in.nextInt();//number of games the player plays
        int[] player = new int[m];
        for(int j=0; j < m; j++){
            player[j] = in.nextInt();
        }
        printScores(ranked, player);
    }

    public static void printScores(int[] ranked, int[] player){
        ArrayList<Integer> places = new ArrayList<Integer>();
        int place = 1;
        places.add(ranked[0]);
        for(int i = 1; i < ranked.length; i++){
            int currPlace = place-1;
            int currScore = ranked[i];
            if(currScore != places.get(currPlace)){
                place++;
                places.add(currScore);
            }
        }

        int currPlace = places.size() + 1;
        for(int i = 0; i < player.length; i++){
            currPlace = getPlace(currPlace, player[i], places);
            System.out.println(currPlace);
        }

    }

    public static int getPlace(int currPlace, int currScore, ArrayList<Integer> places){
        for(int i = currPlace - 1; i > 0; i--){
            int index = i - 1;
            if(currScore < places.get(index)){
                return i + 1;
            }
        }
        return 1;
    }
}
