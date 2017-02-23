
public class euler5 {


    public static void main(String[] args) {
        int highbound=100;
        int sum = highbound*(highbound+1)/2;
        int squareofsum = sum*sum;
        int sumofsquares=0;
        for (int n =1; n<=highbound; n++)
            sumofsquares+=n*n;
        int difference=squareofsum-sumofsquares;
        System.out.println(difference);
    }

}
