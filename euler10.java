import java.util.*;
public class euler10 {

    public static void main(String[] args) {
        int limit=2000000;
       int number=0;
       double sum=2;
       List<Integer> primes= new ArrayList<Integer>();
        primes.add(2);

        for (number=3; number<limit; number++){
            for (int i=0; i<primes.size();i++){
                if (number%primes.get(i)==0)
                    break;
                if (primes.get(i)>=number/2+1){
                    primes.add(number);
                    sum+=number;
                    break;
                }
            }

        }
        System.out.printf("sum= %1.0f",sum);
    }
}
