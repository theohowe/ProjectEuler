
public class euler3 {

	public static void main(String[] args) {
		double number = 600851475143.0;
		int prime=1;
		/* rough estimate, square root is <300,000
		 * therefore, the number can't be larger than that
		 */
		for (int i=3; i<300000; i++){
			if (number%i==0){
				number=number/i;
				prime = i;
			}
		}
		System.out.println(prime);
	}
}
