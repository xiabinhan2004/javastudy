import java.util.Arrays;

public class ti_6341 {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int sum_player1=0,sum_player2=0;
        if(player1[0]==10||player1[1]==10){
            for (int i = 0; i < player1.length; i++) {
                if(i==0||i==1)
                {
                    sum_player1=sum_player1+player1[i];                    
                }
                else{
                    sum_player1=sum_player1+player1[i]*2;

                }
            }
        }
        else{
            for (int i = 0; i < player1.length; i++) {
                sum_player1+=player1[i];
            }
        }
        if(player2[0]==10||player2[1]==10){
            for (int i = 0; i < player2.length; i++) {
                if(i==0||i==1)
                {
                    sum_player2=sum_player2+player2[i];                    
                }
                else{
                    sum_player2=sum_player2+player2[i]*2;

                }
            }
        }
        else{
            for (int i = 0; i < player2.length; i++) {
                sum_player2+=player2[i];
            }
        }
        if(sum_player1>sum_player2)
        {
            return 1;
        }
        else if(sum_player2>sum_player1)
        {
            return 2;
        }
        else{
            return 0;
        }




        return 0;

    }
}