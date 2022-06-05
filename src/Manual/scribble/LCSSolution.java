package Manual.scribble;

public class LCSSolution {
    public static void main(String[] args) {
        System.out.println("rabbbit".length());
        System.out.println(numDistinct("rabbbit","rabbit"));
    }

    private static  int numDistinct(String first,String second){
        int firstLength = first.length();
        int secondLength = second.length();
        int dp[][] = new int[firstLength-1][secondLength-1];
        for(int i=0;i<firstLength-1;i++){
            dp[i][0] = 1;
        }
        for(int i=0;i<firstLength;i++){
            for(int j=0;j<secondLength;j++){
                if(dp[i][j] > dp[i-1][j-1]){
                    dp[i][j] = dp[i-1][j-1] + dp[i][j-1];
                }
                dp[i][j] = dp[i][j-1];
            }
        }
        return dp[firstLength][secondLength];
    }
}
