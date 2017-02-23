import java.util.ArrayList;

public class euler7 {

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		int number=3;
		while (primes.size()<10001){
			boolean isPrime=true;
			for (int i: primes){
				if (number%i==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				primes.add(number);
			number++;
		}
	System.out.println(primes.get(10000));	
	}
}


