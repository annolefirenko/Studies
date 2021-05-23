package HackerRank;

import java.util.Scanner;

public class GridSearch {
    public static boolean isMatch(String[] G, int r, int c, String[] P) {
        for(int i = r; i < r + P.length; i++) {
            if(!G[i].substring(c, c + P[0].length()).equals(P[i - r]))
                return false;
        }
        return true;
    }

    public static void solve() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//number of test`s cases
        for(int k = 0; k < t; k++){
            int R = sc.nextInt();//the number of rows in G
            int C = sc.nextInt();//the length of each row string in G
            String[] G = new String[R];
            for(int i = 0; i < R; i++){
                G[i] = sc.next();//the largest grid
            }
            int r = sc.nextInt();//the number of rows in P
            int c = sc.nextInt();//the length of each row string in P
            String[] P = new String[r];
            for(int i = 0; i < r; i++) {
                P[i] = sc.next();//the pattern grid
            }
            boolean ret = false;//return value
            for(int i = 0; i <= R - r; i++){
                for(int j = 0; j <= C - c; j++){
                    if(G[i].charAt(j) == P[0].charAt(0)){//returning indexes method
                        ret = isMatch(G, i, j, P);
                        if(ret)
                            break;
                    }
                }
                if(ret)
                    break;
            }
            if(ret){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
