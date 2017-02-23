
public class Euler14 {
    
    
    public static void main(String[] args) {
        int limit = 1000000;
        int moves=0;
        int winnerWinnerChickenDinner=0;
        for (int i =2; i<limit; i++){
            int tempmoves=0;
            double holder=i;
            while (holder!=1){
                tempmoves++;
                if (holder%2==0){
                    holder=holder/2;
                }
                else
                    holder=3*holder+1;
            }
            if (tempmoves>moves){
                moves=tempmoves;
                winnerWinnerChickenDinner=i;
            }
        }
        System.out.println(winnerWinnerChickenDinner);
    }
    
}
