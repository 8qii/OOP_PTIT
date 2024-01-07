import java.util.*;

public class J08029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[][] dp = new int[15][15];
            String x = sc.next();
            String y = sc.next();
            int x2 = Integer.parseInt(String.valueOf(x.charAt(1)));
            int y2 = Integer.parseInt(String.valueOf(y.charAt(1)));
            int x1 = 0;
            int y1 = 0;
            String s = "abcdefgh";
            for(int i = 0 ; i < s.length() ; i ++){
                if(x.charAt(0) == s.charAt(i)) x1 = i + 1;
                if(y.charAt(0) == s.charAt(i)) y1 = i + 1;
            }
            for(int i = 0 ; i < 15 ; i ++){
                for(int j = 0 ; j < 15 ; j ++){
                    dp[i][j] = 10000;
                }
            }
            dp[x1][x2] = 0;
            boolean check = true;
            while(check){
                check = false;
                for(int i = 1 ; i < 9 ; i ++){
                    for(int j = 1 ; j < 9 ; j ++){
                        try{
                            int z = dp[i][j];
                            dp[i][j] = Math.min(dp[i][j] , dp[i-1][j-2] + 1);
                            if(z != dp[i][j]) check = true;
                        } catch(Exception e){

                        }
                        try{
                            int z = dp[i][j];
                            dp[i][j] = Math.min(dp[i][j] , dp[i-2][j-1] + 1);
                            if(z != dp[i][j]) check = true;
                        } catch(Exception e){

                        }
                        try{
                            int z = dp[i][j];
                            dp[i][j] = Math.min(dp[i][j] , dp[i+1][j-2] + 1);
                            if(z != dp[i][j]) check = true;
                        } catch(Exception e){

                        }
                        try{
                            int z = dp[i][j];
                            dp[i][j] = Math.min(dp[i][j] , dp[i+2][j-1] + 1);
                            if(z != dp[i][j]) check = true;
                        } catch(Exception e){

                        }
                        try{
                            int z = dp[i][j];
                            dp[i][j] = Math.min(dp[i][j] , dp[i-1][j+2] + 1);
                            if(z != dp[i][j]) check = true;
                        } catch(Exception e){

                        }
                        try{
                            int z = dp[i][j];
                            dp[i][j] = Math.min(dp[i][j] , dp[i-2][j+1] + 1);
                            if(z != dp[i][j]) check = true;
                        } catch(Exception e){

                        }
                        try{
                            int z = dp[i][j];
                            dp[i][j] = Math.min(dp[i][j] , dp[i+1][j+2] + 1);
                            if(z != dp[i][j]) check = true;
                        } catch(Exception e){

                        }
                        try{
                            int z = dp[i][j];
                            dp[i][j] = Math.min(dp[i][j] , dp[i+2][j+1] + 1);
                            if(z != dp[i][j]) check = true;
                        } catch(Exception e){

                        }
                    }
                }
            }
            System.out.println(dp[y1][y2]);
        }
    }
}
