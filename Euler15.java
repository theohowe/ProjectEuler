public class Euler15 {
    
    static double paths=0;
    static int GRIDSIZE=20;
    
    public static double factorial(int x){
        double fact=1;
        for (int i=1; i<=x; i++){
            fact=fact*i;
        }
        return fact;
    }
    
    public static void main(String[] args){
        paths= factorial(2*GRIDSIZE)/(factorial(GRIDSIZE)*factorial(GRIDSIZE));
        System.out.printf("%.0f",paths);
        
    }
}

