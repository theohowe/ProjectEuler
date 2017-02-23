import java.util.*;



public class euler12 {
    
    
    public static void main(String[] args) {
        double number, triangle;
        int divisors;
        
        for (number=12000; number<Double.MAX_VALUE;number++){
            triangle = number*(number+1)/2;
            divisors=1;
            for (int i=1; i<=triangle/2; i++){
                if (triangle%i==0)
                    divisors++;
            }
            if (number%1000==0)
                System.out.printf("%,1.0fth triangle = %,1.0f with %d divisors\n",number,triangle, divisors);
            if (divisors>500){
                System.out.printf("Final: %1.0f\n",number);
                break;
            }
        }
    }
}
            
 